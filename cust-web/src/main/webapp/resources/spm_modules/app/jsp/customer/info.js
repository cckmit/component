define('app/jsp/customer/info', function (require, exports, module) {
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
    var carlistPager = Widget.extend({
    	
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
            },
    	//重写父类
    	setup: function () {
    		carlistPager.superclass.setup.call(this);
    		this._selectCarList();
    	},
    	//查询车辆列表
    	_selectCarList:function(){
    		var _this = this;
    		var custId = $("#custId").text()?$("#custId").text().trim():"";
    		
    		$("#pagination-ul").runnerPagination({
    			
	 			url: _base+"/customer/getCarList",
	 			
	 			method: "POST",
	 			dataType: "json",
	 			renderId: "searchCarInfoData",
	 			messageId: "showMessageDiv",
	 			
	 			data: {"custId":custId},
	           	pageSize: carlistPager.DEFAULT_PAGE_SIZE,
	           	visiblePages:5,
	           	callback: function (data) {
	            	if(data && data.result && data.result.length>0){
	            		var template = $.templates("#searchCarTemple");
	            	    var htmlOutput = template.render(data);
	            	    $("#searchCarInfoData").html(htmlOutput);
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
    
    module.exports = carlistPager
});

