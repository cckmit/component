define(
		'app/jsp/dstdiscountlevel/editdstdiscountlevel',
		function(require, exports, module) {
			'use strict';
			var $ = require('jquery'), Widget = require('arale-widget/1.2.0/widget'), Dialog = require("optDialog/src/dialog"), AjaxController = require('opt-ajax/1.0.0/index');
			require("jsviews/jsrender.min");
			require("jsviews/jsviews.min");
			require("ztree/jquery.ztree.all-3.5.min");
			require("jquery-validation/1.15.1/jquery.validate");
			require("app/util/aiopt-validate-ext");
			require("my97DatePicker/WdatePicker");
			require("bootstrap-paginator/bootstrap-paginator.min");
			require("app/util/jsviews-ext");
			require("opt-paging/aiopt.pagination");

			var SendMessageUtil = require("app/util/sendMessage");
			var validateForm = $("#dstDiscountLevelForm")
					.validate(
							{
								rules : {
									levelCode : {
										required : true,
										maxlength : 15,
										commonTextCharLine:true,
										remote : {
											type : "POST",
											url : _base
													+ "/dstdiscountlevel/dstdiscountevelexistbycode",
											data : {
												levelCode : function() {
													return $("#levelCode").val();
												},levelId : function() {
													return $("#levelId").val();
												}
											}
										}
									},
									levelName : {
										required : true,
										maxlength : 15
									},
									instructions : {
										required : false,
										maxlength : 100
									}
								},
								messages : {
									levelCode : {
										required : "请输入级别编码",
										minlength : "级别编码长度不能小于 {0} 个字",
										maxlength : "级别编码长度不能大于 {0} 个字",
										remote:"级别编码已存在"
									},
									levelName : {
										required : "请输入级别名称",
										minlength : "级别名称长度不能小于 {0} 个字",
										maxlength : "级别名称长度不能大于 {0} 个字"
									},
									instructions : {
										required : "请输入级别描述",
										maxlength : "级别描述长度不能大于 {0} 个字"										
									}
								}
							});
			// 实例化AJAX控制处理对象
			var ajaxController = new AjaxController();
			// 定义页面组件类
			var editdstdiscountlevelPager = Widget
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
							"click #saveDiscountlevel" : "_saveDiscountlevel",
							// "blur #levelCode" : "_checklevelCode",
							"click #selectDiscountlevelList" : "_listPage"
						},
						// 重写父类
						setup : function() {
							editdstdiscountlevelPager.superclass.setup
									.call(this);
							this._loadZtree();
						},
						// 查询级别列表
						_listPage : function() {
							/* window.open(_base+"/dstdiscountlevel/dstdiscountleveldetail/"+levelCode,"级别详情","fullscreen=yes"); */
							window.location.href = _base
									+ "/dstdiscountlevel/dstdiscountlevellist";
						},
						// 保存级别信息
						_saveDiscountlevel : function() {
							var _this = this;
							if (!validateForm.form()) {
								return;
							}
							var disInfoCodes = "";
							var changsnodes = zTree.getCheckedNodes();
							for (var i = 0; i < changsnodes.length; i++) {
								if (1 == changsnodes[i].level) {
									disInfoCodes += changsnodes[i].id + ",";
								}
							}
							console.log(disInfoCodes);

							var dstDiscountLevelstr = {
								"levelId" : $("#levelId").val().trim(),
								"levelName" : $("#levelName").val().trim(),
								"levelCode" : $("#levelCode").val().trim(),
								"instructions" : $("#instructions").val()
										.trim()
							};
							ajaxController
									.ajax({
										type : "get",
										processing : true,
										message : "保存中，请等待...",
										url : _base
												+ "/dstdiscountlevel/dstdiscountlevelsaveorupdate",
										data : {
											'dstDiscountLevelstr' : JSON
													.stringify(dstDiscountLevelstr),
											'disInfoCodes' : disInfoCodes
										},
										success : function(data) {
											if ("1" === data.statusCode) {
												_this._listPage();
											}
										}
									});
						},
						// 滚动到顶部
						_returnTop : function() {
							var container = $('.wrapper-right');
							container.scrollTop(0);// 滚动到div 顶部
						},
						_checklevelCode : function() {
							var _this = this;
							var _levelId = $("#levelId").val().trim();

							if ('' != _levelId) {
								return;
							}
							var _levelCode = $("#levelCode").val().trim();
							if ('' === _levelCode) {
								return;
							}
							ajaxController
									.ajax({
										type : "get",
										processing : true,
										message : "校验中，请等待...",
										url : _base
												+ "/dstdiscountlevel/dstdiscountevelexistbycode/"
												+ _levelCode,
										data : {},
										success : function(data) {
											if ("true" == data.statusInfo) {
												var d = Dialog({
													title : "提示",
													content : '编码重复！',
													icon : 'help',
													cancelValue : "我知道了",
													cancel : function() {
														this.close();
													}
												});
												d.show();
												$("#saveDiscountlevel").attr(
														"disabled", true);
												$("#saveDiscountlevel")
														.attr("class",
																".btn.disabled btn-medium ml-10");

											} else {
												$("#saveDiscountlevel").attr(
														"disabled", false);
												$("#saveDiscountlevel")
														.attr("class",
																"btn-blue btn-medium ml-10");
											}
										}
									});
						},
						// 滚动到顶部
						_loadZtree : function(zNodes) {

						}
					});

			module.exports = editdstdiscountlevelPager
		});
