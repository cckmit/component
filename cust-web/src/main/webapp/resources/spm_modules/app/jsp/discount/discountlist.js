define('app/jsp/discount/discountlist', function (require, exports, module) {
    'use strict';
    var $=require('jquery'),
	    Widget = require('arale-widget/1.2.0/widget'),
	    Dialog = require("optDialog/src/dialog"),
	    AjaxController = require('opt-ajax/1.0.0/index');
    require("jsviews/jsrender.min");
    require("jsviews/jsviews.min");
    require("my97DatePicker/WdatePicker");
    require("bootstrap-paginator/bootstrap-paginator.min");
    require("app/util/jsviews-ext");
    require("opt-paging/aiopt.pagination");
    
    var SendMessageUtil = require("app/util/sendMessage");
    
    //实例化AJAX控制处理对象
    var ajaxController = new AjaxController();
    var clickId = "";
    //定义页面组件类
    var discountlistPager = Widget.extend({
    	
    	Implements:SendMessageUtil,
    	//属性，使用时由类的构造函数传入
    	attrs: {
    		clickId:""
    	},
    	Statics: {
    		DEFAULT_PAGE_SIZE: 10
    	},
    	//事件代理
    	events: {
    		//查询客户列表
            "click #selectDiscountList":"_selectDiscountList",
            "click #lockBtn-close":"_closeLockDialog",
    		"click #lockBtn":"_lockCustomer",//锁定客户
    		"click #unlockBtn-close":"_closeUnlockDialog",
    		"click #unlockBtn":"_unlockCustomer",//锁定客户
            },
    	//重写父类
    	setup: function () {
    		discountlistPager.superclass.setup.call(this);
    		this._clearQueryParams();
    		this._selectDiscountList();
    		this._queryDiscountClass();
    		this._getDiscountType();
    	},
    	//清空查询条件
    	_clearQueryParams:function(){
    		var custId = $("#custId").val("");
    		var phone = $("#phone").val("");
    		var state = $("#state").val("");
    	},
    	//查询客户列表
    	_selectDiscountList:function(){
    		var _this = this;
    		var discountCode = $("#discountCode").val()?$("#discountCode").val().trim():"";
    		var discountName = $("#discountName").val()?$("#discountName").val().trim():"";
    		var classCode = $("#classCode").val()?$("#classCode").val().trim():"";
    		var discountType = $("#discountType").val()?$("#discountType").val().trim():"";
    		var verifyState = $("#verifyState").val()?$("#verifyState").val().trim():"";
    		
    		$("#pagination-ul").runnerPagination({
    			
	 			url: _base+"/discount/getDiscountList",
	 			
	 			method: "POST",
	 			dataType: "json",
	 			renderId: "searchDiscountData",
	 			messageId: "showMessageDiv",
	 			
	 			data: {"discountCode":discountCode,"discountName":discountName,"classCode":classCode,"discountType":discountType,"verifyState":verifyState},
	           	pageSize: discountlistPager.DEFAULT_PAGE_SIZE,
	           	visiblePages:5,
	           	callback: function (data) {
	            	if(data && data.result && data.result.length>0){
	            		var template = $.templates("#searchDiscountTemple");
	            	    var htmlOutput = template.render(data);
	            	    $("#searchDiscountData").html(htmlOutput);
	            	}
	            	_this._returnTop();
	            }
    		});
    	},
    	_queryDiscountClass : function(){
    		var _this = this;
    		ajaxController.ajax({
    			type: "post",
//    			processing: true,
//    			message: "保存中，请等待...",
    			url: _base+"/discount/queryDiscountClass",
    			data:{},
    			success: function(data){
    				if("1"===data.statusCode){
    					var originClassCode = $("#classCode").attr('originClassCode');
//    					$("#classCode").append('<option value="请选择">--请选择--</option>');
    					for(var i in data.data){
    							var selected = "";
    							if(!_this._isBlank(originClassCode) && originClassCode == data.data[i].classCode){
    								selected = 'selected="selected"';
    							}
    							$("#classCode").append('<option value="'+data.data[i].classCode+'" '+selected+'>'+data.data[i].className+'</option>');
    					}
    				}
    			}
    		});
    	},
    	_getDiscountType : function(){
    		var _this = this;
    		ajaxController.ajax({
    			type: "post",
//    			processing: true,
//    			message: "保存中，请等待...",
    			url: _base+"/param/getDiscountType",
    			data:{},
    			success: function(data){
    				var originDiscountType = $("#discountType").attr('originDiscountType');
//    				$("#discountType").append('<option value="请选择">--请选择--</option>');
    				for(var i in data){
    						var selected = "";
    						if(!_this._isBlank(originDiscountType) && originDiscountType == data[i].paramCode){
    							selected = 'selected="selected"';
    						}
    						$("#discountType").append('<option value="'+data[i].paramCode+'" '+selected+'>'+data[i].paramName+'</option>');
    				}
    			}
    		});
    	},
    	//删除确认提示框
    	_showDelConf:function(attrId){
    		var _this = this;
    		new Dialog({
    			content:'确定删除该权益吗？',
    			icon:'help',
    			okValue: '确 定',
    			title:'提示',
    			ok:function(){
    				this.close();
    				_this._delAttr(attrId);
    			},
    			cancelValue: '取消',
    			cancel: function () {
    				this.close();
    			}
    		}).show();
    	},
    	//删除
    	_delAttr:function(attrId){
    		var _this = this;
    		this._closeDelConf();
    		ajaxController.ajax({
    			type: "get",
    			processing: true,
    			message: "数据删除中,请等待...",
    			url: _base+"/discount/deleteDiscount/"+attrId,
    			success: function(data){
    				//获取数据成功
    				if("1"===data.statusCode){
    					//刷新当前数据
    					//$("#pagination-ul .page .active").trigger("click");
    					window.location.reload();
    				}
    			}
    		});
    	},
    	//关闭确认提示框
	_closeDelConf:function(){
		$('#eject-mask').fadeOut(100);
		$('#aband-small').slideUp(150);
		$("#delAttrId").val('');
	},
    	_showLockDialog:function(custId,state){
    		$("#custId_dialog").html(custId);
    		if(state == '0'){
    			state = "未认证"
    		}
    		if(state == '1'){
    			state = "已认证"
    		}
    		$("#state_dialog").html(state);
    		$('#eject-mask').fadeIn(100);
			$('#refuse-small').slideDown(200);
    	},
    	_showUnlockDialog:function(custId,state,lockDes){
    		$("#custId_dialog1").html(custId);
    		if(state == '0'){
    			state = "未认证"
    		}
    		if(state == '1'){
    			state = "已认证"
    		}
    		$("#state_dialog1").html(state);
    		$("#lockDes1").val(lockDes);
    		$("#lockDes1").attr("disabled", true);
    		$('#eject-mask1').fadeIn(100);
			$('#refuse-small1').slideDown(200);
    	},
    	_lockCustomer:function(){
    		var _this = this;
    		var custId = $("#custId_dialog").text();
    		var lockDes = $("#lockDes").val();
    		this._closeLockDialog();
    		ajaxController.ajax({
				type: "post",
				processing: true,
				// message: "加载中，请等待...",
				url: _base+"/customer/lockcustomer",
				data:{"custId":custId,"lockDes":lockDes},
				success: function(data){
					_this._selectCustomerList();
				}
			});
    	},
    	_unlockCustomer:function(){
    		var _this = this;
    		var custId = $("#custId_dialog1").text();
    		this._closeUnlockDialog();
    		ajaxController.ajax({
				type: "post",
				processing: true,
				// message: "加载中，请等待...",
				url: _base+"/customer/unlockcustomer",
				data:{"custId":custId},
				success: function(data){
					_this._selectCustomerList();
				}
			});
    	},
    	_closeLockDialog:function(){
			$('#eject-mask').fadeOut(100);
			$('#refuse-small').slideUp(150);
			$("#custId_dialog").html("");
			$("#state_dialog").html("");
			$("#lockDes").val("");
    	},
    	_closeUnlockDialog:function(){
			$('#eject-mask1').fadeOut(100);
			$('#refuse-small1').slideUp(150);
			$("#custId_dialog1").html("");
			$("#state_dialog1").html("");
			$("#lockDes1").val("");
			$("#lockDes1").removeAttr("disabled");
    	},
    	//滚动到顶部
    	_returnTop:function(){
    		var container = $('.wrapper-right');
    		container.scrollTop(0);//滚动到div 顶部
    	}, 	
    	_isBlank : function(obj){
    		return(!obj || $.trim(obj) === "");
    	}
    });
    
    module.exports = discountlistPager
});

