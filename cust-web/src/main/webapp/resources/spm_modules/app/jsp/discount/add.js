define('app/jsp/discount/add', function (require, exports, module) {
    'use strict';
    var $=require('jquery'),
	    Widget = require('arale-widget/1.2.0/widget'),
	    Dialog = require("optDialog/src/dialog"),
	    AjaxController = require('opt-ajax/1.0.0/index');
    require("jsviews/jsrender.min");
    require("jsviews/jsviews.min");
    require("app/util/jsviews-ext");
    
    require("jquery-validation/1.15.1/jquery.validate");
	require("app/util/aiopt-validate-ext");
    
    var SendMessageUtil = require("app/util/sendMessage");
    
    //实例化AJAX控制处理对象
    var ajaxController = new AjaxController();
    var clickId = "";
    //定义页面组件类
    var addPager = Widget.extend({
    	
    	Implements:SendMessageUtil,
    	//属性，使用时由类的构造函数传入
    	attrs: {
    		clickId:""
    	},
    	//事件代理
    	events: {
    		//保存数据
		"click #saveDiscount":"_saveDiscount",
        },
    	//重写父类
    	setup: function () {
    		addPager.superclass.setup.call(this);
    		this._init();
    		
    	},
    	_init : function(){
    		 $(".relation-special table tr .click a").click(function () {
    				$(this).children('i').toggleClass("fa-minus fa-plus");
    				$(this).parent().parent().parent().parent().parent().parent().parent().children('.zhank').slideToggle(100);
    		    });
    		 $("[name='attrCheck']").click(function () {
    			 var _this = this;
			 $("[name='ownerLimitType']").each(function () {
		            $(this).prop("checked", $(_this).is(':checked'));
		        });
 		    });
    		 this._queryDiscountClass();
 		 this._getDiscountType();
 		 this._getEffectUnitCode();
 		 this._getDiscountOwnerLimitType();
    	},
    	//保存成本信息
    	_saveDiscount : function(){
			var _this = this;
			var formValidator=$("#discountAddForm").validate({
				/*errorPlacement: function(error, element) {
					$("#" + element.attr( "name" )).append( error );
				}*/
			});
			$.extend($.validator.messages, {  
			    required: '该项为必填项'
			});
			if(!formValidator.form()){
				return;
			}
			var classCode = $('#classCode').val();
			var discountId = $('#discountId').val();
			var discountName = $('#discountName').val();
			var discountCode = $('#discountCode').val();
			var discountType = $('#discountType').val();
			var effectiveTime = $('#effectiveTime').val();
			var effectiveUnit = $('#effectiveUnit').val();
			var discountInstructions = $('#discountInstructions').val();
			
			var ownerLimitArray = new Array();
			$("[name='ownerLimitType']").each(function(){
				if($(this).is(':checked')){
					var ownerLimit = {"ownerCode":$(this).attr("attrid"), "limitStatus":"1"};
					ownerLimitArray.push(ownerLimit);
				}
			});
			
			var saveData = {"classCode":classCode,"discountId":discountId,"discountName":discountName,"discountCode":discountCode,"discountInstructions":discountInstructions,
					"discountType":discountType,"effectiveTime":effectiveTime,"effectiveUnit":effectiveUnit, "limitVos":ownerLimitArray};
			//验证通过,则进行保存操作.this._checkInput() &&
				ajaxController.ajax({
					type: "post",
					dataType : "json",
					processing: true,
					message: "保存中，请等待...",
					url: _base+"/discount/save",
					data:{ "discountInfoStr":JSON.stringify(saveData)},
					success: function(data){
						if("1"===data.statusCode){
							var d = Dialog({
								title:"提示",
								content:data.statusInfo,
								icon:'success',
								cancelValue: '确 定',
								cancel:function(){
									this.close();
									//保存成功,回退到进入的列表页
									window.location.href=_base+"/discount/list";
								}
							});
							d.show();
						}else{
							var d = Dialog({
								title:"错误",
								content:data.statusInfo,
								icon:'fail',
								cancelValue: '确 定',
								cancel:function(){
									this.close();
								}
							});
							d.show();
						}
					}
				});
		},
		
	_queryDiscountClass : function(){
		var _this = this;
		ajaxController.ajax({
			type: "post",
//			processing: true,
//			message: "保存中，请等待...",
			url: _base+"/discount/queryDiscountClass",
			data:{},
			success: function(data){
				if("1"===data.statusCode){
					var originClassCode = $("#classCode").attr('originClassCode');
//					$("#classCode").append('<option value="请选择">--请选择--</option>');
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
//			processing: true,
//			message: "保存中，请等待...",
			url: _base+"/param/getDiscountType",
			data:{},
			success: function(data){
				var originDiscountType = $("#discountType").attr('originDiscountType');
//				$("#discountType").append('<option value="请选择">--请选择--</option>');
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
	_getEffectUnitCode : function(){
		var _this = this;
		ajaxController.ajax({
			type: "post",
//			processing: true,
//			message: "保存中，请等待...",
			url: _base+"/param/getEffectUnitCode",
			data:{},
			success: function(data){
				var originEffectiveUnit = $("#effectiveUnit").attr('originEffectiveUnit');
//				$("#discountType").append('<option value="请选择">--请选择--</option>');
				for(var i in data){
						var selected = "";
						if(!_this._isBlank(originEffectiveUnit) && originEffectiveUnit == data[i].paramCode){
							selected = 'selected="selected"';
						}
						$("#effectiveUnit").append('<option value="'+data[i].paramCode+'" '+selected+'>'+data[i].paramName+'</option>');
				}
			}
		});
	},
	_getDiscountOwnerLimitType : function(){
		ajaxController.ajax({
			type: "post",
//			processing: true,
//			message: "保存中，请等待...",
			url: _base+"/param/getDiscountOwnerLimitType",
			data:{},
			success: function(data){
				var ownerLimitArray = [];
				$("[name='originOwnerLimit']").each(function(){
					ownerLimitArray.push($(this).val());
				});
				var html = "";
				var allChecked = true;
				for(var i in data){
					html += "<ul><li><p>";
					if($.inArray(data[i].paramCode, ownerLimitArray)<0){
						allChecked  = false;
						html += '<input name="ownerLimitType" type="checkbox" class="margin-checkbox m-left" attrid="'+data[i].paramCode+'">'+ data[i].paramName;
					}else{
						html += '<input name="ownerLimitType" type="checkbox" checked="checked" class="margin-checkbox m-left" attrid="'+data[i].paramCode+'">'+ data[i].paramName;
					}
					html += "</p></li></ul>";
				}
				if(allChecked){
					$("[name='attrCheck']").prop("checked", true);
				}
				$("#relation-table-div").append(html);
				
				$("[name='ownerLimitType']").each(function () {
			           $(this).click(function(){
			        	   		if($('.zhank').find("[name='ownerLimitType']:checked").length == $('.zhank').find("[name='ownerLimitType']").length){
			        	   			$("[name='attrCheck']").prop("checked", true);
			        	   		}else{
			        	   			$("[name='attrCheck']").prop("checked", false);
			        	   		}
			           })
			        });
			}
		});
	},
	_isBlank : function(obj){
		return(!obj || $.trim(obj) === "");
	}
		
    });
    
    module.exports = addPager
});

