define('app/jsp/discount/view', function (require, exports, module) {
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
//    		 $(".relation-special table tr .click a").click(function () {
//    				$(this).children('i').toggleClass("fa-minus fa-plus");
//    				$(this).parent().parent().parent().parent().parent().parent().parent().children('.zhank').slideToggle(100);
//    		    });
//    		 $("[name='attrCheck']").click(function () {
//    			 var _this = this;
//			 $("[name='ownerLimitType']").each(function () {
//		            $(this).prop("checked", $(_this).is(':checked'));
//		        });
// 		    });
    		 this._queryDiscountClass();
 		 this._getDiscountType();
 		 this._getEffectUnitCode();
 		 this._getDiscountOwnerLimitType();
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
					var originClassCode = $("#classCode").val();
//					$("#classCode").append('<option value="请选择">--请选择--</option>');
					for(var i in data.data){
							if(!_this._isBlank(originClassCode) && originClassCode == data.data[i].classCode){
								$('.classCode').html(data.data[i].className);
							}
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
				var originDiscountType = $("#discountType").val();
//				$("#discountType").append('<option value="请选择">--请选择--</option>');
				for(var i in data){
						if(!_this._isBlank(originDiscountType) && originDiscountType == data[i].paramCode){
							$('.discountType').html(data[i].paramName);
						}
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
				var originEffectiveUnit = $("#effectiveUnit").val();
//				$("#discountType").append('<option value="请选择">--请选择--</option>');
				for(var i in data){
						if(!_this._isBlank(originEffectiveUnit) && originEffectiveUnit == data[i].paramCode){
							$('.effectiveUnit').html(data[i].paramName);
						}
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
				for(var i in data){
					html += "<ul><li><p>";
					if($.inArray(data[i].paramCode, ownerLimitArray)>=0){
						html += data[i].paramName;
					}
					html += "</p></li></ul>";
				}
				$("#relation-table-div").append(html);
			}
		});
	},
	_isBlank : function(obj){
		return(!obj || $.trim(obj) === "");
	}
		
    });
    
    module.exports = addPager
});

