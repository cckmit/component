define('app/jsp/discount/custdiscountlist', function (require, exports, module) {
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
    var custdiscoutlistPager = Widget.extend({
    	
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
            "click #selectCustDisconutList":"_selectCustDisconutList",
            },
    	//重写父类
    	setup: function () {
    		custdiscoutlistPager.superclass.setup.call(this);
    		this._clearQueryParams();
    		this._selectCustDisconutList();
            this._bindOwnerCode();
    	},
    	//清空查询条件
    	_clearQueryParams:function(){
    		var custId = $("#custId").val("");
    		var ownerCode = $("#ownerCode").val("");
    		var ownerInstanceCode = $("#ownerInstanceCode").val("");
    	},
    	//查询客户列表
    	_selectCustDisconutList:function(){
    		var _this = this;
    		var custId = $("#custId").val()?$("#custId").val().trim():"";
            var custName = $("#custName").val()?$("#custName").val().trim():"";
    		var ownerCode = $("#ownerCode").val()?$("#ownerCode").val().trim():"";
    		var ownerInstanceCode = $("#ownerInstanceCode").val()?$("#ownerInstanceCode").val().trim():"";
            var discountCode = $("#discountCode").val()?$("#discountCode").val().trim():"";
            var discountName = $("#discountName").val()?$("#discountName").val().trim():"";
            var activeStatus = $("#activeStatus").val()?$("#activeStatus").val().trim():"";

    		$("#pagination-ul").runnerPagination({
    			
	 			url: _base+"/discount/getCustDiscountList",
	 			
	 			method: "POST",
	 			dataType: "json",
	 			renderId: "searchCustdiscountData",
	 			messageId: "showMessageDiv",
	 			
	 			data: {"custId":custId,"custName":custName,"ownerCode":ownerCode,"ownerInstanceCode":ownerInstanceCode,"discountCode":discountCode,
					"discountName":discountName,"activeStatus":activeStatus},
	           	pageSize: custdiscoutlistPager.DEFAULT_PAGE_SIZE,
	           	visiblePages:5,
	           	callback: function (data) {
	            	if(data && data.result && data.result.length>0){
	            		var template = $.templates("#searchCustdiscountTemple");
	            	    var htmlOutput = template.render(data);
	            	    $("#searchCustdiscountData").html(htmlOutput);
	            	}
	            	_this._returnTop();
	            }
    		});
    	},
        // 下拉 订单状态
        _bindOwnerCode : function() {
            var this_=this;
            $.ajax({
                type : "post",
                processing : false,
                url : _base+ "/param/getDiscountOwnerLimitType",
                dataType : "json",
                data :"",
                message : "正在加载数据..",
                success : function(data) {
                    var d=data;
                    $.each(d,function(index,item){
                        var paramName = d[index].paramName;
                        var paramCode = d[index].paramCode;
                        $("#ownerCode").append('<option value="'+paramCode+'">'+paramName+'</option>');
                    })
                }
            });
        },
    	//滚动到顶部
    	_returnTop:function(){
    		var container = $('.wrapper-right');
    		container.scrollTop(0);//滚动到div 顶部
    	}, 	
    });
    
    module.exports = custdiscoutlistPager
});

