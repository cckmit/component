define(
		'app/jsp/dstdiscountlevel/dstdiscountlevellist',
		function(require, exports, module) {
			'use strict';
			var $ = require('jquery'), Widget = require('arale-widget/1.2.0/widget'), Dialog = require("optDialog/src/dialog"), AjaxController = require('opt-ajax/1.0.0/index');
			require("jsviews/jsrender.min");
			require("jsviews/jsviews.min");
			require("my97DatePicker/WdatePicker");
			require("bootstrap-paginator/bootstrap-paginator.min");
			require("app/util/jsviews-ext");
			require("opt-paging/aiopt.pagination");

			var SendMessageUtil = require("app/util/sendMessage");

			// 实例化AJAX控制处理对象
			var ajaxController = new AjaxController();
			// 定义页面组件类
			var dstdiscountlevelPager = Widget
					.extend({

						Implements : SendMessageUtil,
						// 属性，使用时由类的构造函数传入
						attrs : {
							clickId : ""
						},
						Statics : {
							DEFAULT_PAGE_SIZE : 5
						},
						// 事件代理
						events : {
							// 查询客户列表
							"click #selectDiscountList" : "_selectDiscountList",
//							"click #clearQueryParams" : "_clearQueryParams",
							"click #addDiscountLevel" : "_addDiscountLevel"
						},
						// 重写父类
						setup : function() {
							dstdiscountlevelPager.superclass.setup.call(this);
							this._clearQueryParams();
							this._selectDiscountList();
						},
						// 清空查询条件
						_clearQueryParams : function() {
							$("#discountId").val("");
							$("#verifyState").val("");
						},
						// 查询客户列表
						_selectDiscountList : function() {
							var _this = this;
							var discountId = $("#discountId").val() ? $(
									"#discountId").val().trim() : "";
							var levelName = $("#levelName").val() ? $(
							"#levelName").val().trim() : "";
							var status = $("#verifyState").val() ? $(
									"#verifyState").val().trim() : "";

							$("#pagination-ul")
									.runnerPagination(
											{

												url : _base
														+ "/dstdiscountlevel/getDstDiscountevellist",

												method : "POST",
												dataType : "json",
												renderId : "searchDiscountData",
												messageId : "showMessageDiv",

												data : {
													"levelCode" : discountId,
													"levelName" : levelName,
													"status" : status
												},
												pageSize : dstdiscountlevelPager.DEFAULT_PAGE_SIZE,
												visiblePages : 5,
												callback : function(data) {
													if (data
															&& data.result
															&& data.result.length > 0) {
														var template = $
																.templates("#searchDiscountTemple");
														var htmlOutput = template
																.render(data);
														$("#searchDiscountData")
																.html(
																		htmlOutput);
													}
													_this._returnTop();
												}
											});
						},
						// 删除确认提示框
						_showDelConf : function(levelCode) {
							var _this = this;
							var d = Dialog({
								title : "提示",
								content : '确定删除该级别吗？',
								icon : 'help',
								okValue : '确 定',
								ok : function() {
									var isOk = _this._delLevel(levelCode);
									if (isOk) {
										this.close();
									}
								},
								cancelValue : '取消',
								cancel : function() {
									this.close();
								}
							});
							d.show();
						},
						// 删除级别
						_delLevel : function(levelCode) {
							var _this = this;
							ajaxController
									.ajax({
										type : "get",
										processing : true,
										message : "数据删除中,请等待...",
										url : _base
												+ "/dstdiscountlevel/deldstdiscountevelbycode/"
												+ levelCode,
										success : function(data) {
											// 获取数据成功
											if ("1" === data.statusCode) {
												// 刷新当前数据
												_this._selectDiscountList();
											}
										}
									});
						},
						 _detailPage:function(levelCode){
							 /*window.open(_base+"/dstdiscountlevel/dstdiscountleveldetail/"+levelCode,"级别详情","fullscreen=yes");*/
					            window.location.href = _base+"/dstdiscountlevel/dstdiscountleveldetail/"+levelCode;
					        },						
				        _editPage:function(levelCode){
				        	/*window.open(_base+"/dstdiscountlevel/dstdiscountleveldetail/"+levelCode,"级别详情","fullscreen=yes");*/
				        	window.location.href = _base+"/dstdiscountlevel/dstdiscountleveledit?levelCode="+levelCode;
				        },						
				        _addDiscountLevel:function(levelCode){
				        	/*window.open(_base+"/dstdiscountlevel/dstdiscountleveldetail/"+levelCode,"级别详情","fullscreen=yes");*/
				        	window.location.href = _base+"/dstdiscountlevel/dstdiscountleveledit";
				        },						
						// 滚动到顶部
						_returnTop : function() {
							var container = $('.wrapper-right');
							container.scrollTop(0);// 滚动到div 顶部
						},
					});

			module.exports = dstdiscountlevelPager
		});
