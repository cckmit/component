define('app/jsp/customer/customerlist', function (require, exports, module) {
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
    var customerlistPager = Widget.extend({
    	
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
            "click #selectCustomerList":"_selectCustomerList",
            "click #lockBtn-close":"_closeLockDialog",
    		"click #lockBtn":"_lockCustomer",//锁定客户
    		"click #unlockBtn-close":"_closeUnlockDialog",
    		"click #unlockBtn":"_unlockCustomer",//锁定客户
            },
    	//重写父类
    	setup: function () {
    		customerlistPager.superclass.setup.call(this);
    		this._clearQueryParams();
    		this._selectCustomerList();
    	},
    	//清空查询条件
    	_clearQueryParams:function(){
    		var custId = $("#custId").val("");
    		var phone = $("#phone").val("");
    		var state = $("#state").val("");
    	},
    	//查询客户列表
    	_selectCustomerList:function(){
    		var _this = this;
    		var custId = $("#custId").val()?$("#custId").val().trim():"";
    		var custName = $("#custName").val()?$("#custName").val().trim():"";
    		var phone = $("#phone").val()?$("#phone").val().trim():"";
    		var state = $("#state").val()?$("#state").val().trim():"";
    		
    		$("#pagination-ul").runnerPagination({
    			
	 			url: _base+"/customer/getCustomerList",
	 			
	 			method: "POST",
	 			dataType: "json",
	 			renderId: "searchCustomerData",
	 			messageId: "showMessageDiv",
	 			
	 			data: {"custId":custId,"custName":custName,"phone":phone,"state":state},
	           	pageSize: customerlistPager.DEFAULT_PAGE_SIZE,
	           	visiblePages:5,
	           	callback: function (data) {
	            	if(data && data.result && data.result.length>0){
	            		var template = $.templates("#searchCustomerTemple");
	            	    var htmlOutput = template.render(data);
	            	    $("#searchCustomerData").html(htmlOutput);
	            	}
	            	_this._returnTop();
	            }
    		});
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
    });
    
    module.exports = customerlistPager
});

