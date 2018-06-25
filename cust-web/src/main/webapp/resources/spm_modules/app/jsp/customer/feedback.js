define('app/jsp/customer/feedback', function (require, exports, module) {
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
    var feedbacklistPager = Widget.extend({
    	
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
            "click #selectFeedbackList":"_selectFeedbackList",
            },
    	//重写父类
    	setup: function () {
    		feedbacklistPager.superclass.setup.call(this);
    		this._selectFeedbackList();
    	},
    	//查询客户列表
    	_selectFeedbackList:function(){
    		var _this = this;
    		
    		var custId = $("#custId").val()?$("#custId").val().trim():"";
    		var content = $("#content").val()?$("#content").val().trim():"";
    		var createDateStart = $("#createDateStart").val()?$("#createDateStart").val().trim():"";
    		var createDateEnd = $("#createDateEnd").val()?$("#createDateEnd").val().trim():"";
    		
    		$("#pagination-ul").runnerPagination({
    			
	 			url: _base+"/customer/getFeedbackList",
	 			
	 			method: "POST",
	 			dataType: "json",
	 			renderId: "searchFeedbackData",
	 			messageId: "showMessageDiv",
	 			
	 			data: {"custId":custId,"content":content,"createDateStart":createDateStart,"createDateEnd":createDateEnd},
	           	pageSize: feedbacklistPager.DEFAULT_PAGE_SIZE,
	           	visiblePages:5,
	           	callback: function (data) {
	            	if(data && data.result && data.result.length>0){
	            		var template = $.templates("#searchFeedbackTemple");
	            	    var htmlOutput = template.render(data);
	            	    $("#searchFeedbackData").html(htmlOutput);
	            	}
	            	_this._returnTop();
	            }
    		});
    	},
    	//滚动到顶部
    	_returnTop:function(){
    		var container = $('.wrapper-right');
    		container.scrollTop(0);//滚动到div 顶部
    	}, 	
    });
    
    module.exports = feedbacklistPager
});

