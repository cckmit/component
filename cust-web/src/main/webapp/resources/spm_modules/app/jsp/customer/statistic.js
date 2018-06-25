define(
		'app/jsp/customer/statistic',
		function(require, exports, module) {
			'use strict';
			var $ = require('jquery'), Widget = require('arale-widget/1.2.0/widget'), Dialog = require("optDialog/src/dialog"), AjaxController = require('opt-ajax/1.0.0/index');
			require("jsviews/jsrender.min");
			require("jsviews/jsviews.min");
			require("my97DatePicker/WdatePicker");
			require("bootstrap-paginator/bootstrap-paginator.min");
			require("app/util/jsviews-ext");
			require("opt-paging/aiopt.pagination");
			require("echarts/echarts");

			var SendMessageUtil = require("app/util/sendMessage");

			// 实例化AJAX控制处理对象
			var ajaxController = new AjaxController();
			var clickId = "";
			// 定义页面组件类
			var carlistPager = Widget.extend({

				Implements : SendMessageUtil,
				// 属性，使用时由类的构造函数传入
				attrs : {
					clickId : ""
				},
				Statics : {
					DEFAULT_PAGE_SIZE : 10
				},
				// 事件代理
				events : {},
				// 重写父类
				setup : function() {
					carlistPager.superclass.setup.call(this);
					this._initialView();
				},
				// 初始化视图
				_initialView : function() {
					var myChart = echarts.init(document
							.getElementById('echarts_post'));
					var option = {
						title: {
							show: true,
							text: '客户发展信息',
							x:'left',
							y:'top',
							textStyle: {
								fontSize: 24,
								fontStyle: 'normal',
								fontWeight: 'bold',
							},
						},
						tooltip : {
							trigger : 'item',
							formatter : "{a} <br/>{b} : {c} ({d}%)"
						},
						legend : {
							orient : 'horizontal',
							x : 'center',
							y : 'bottom',
							data : [ '周会员', '月会员', '6月会员', '12月会员' ]
						},
						calculable : true,
						series : [ {
							name : '访问来源',
							selectedMode : 'single',
							type : 'pie',
							radius : [ '50%', '70%' ],
							avoidLabelOverlap : false,
							label : {
								normal : {
									show : false,
									position : 'center'
								},
								emphasis : {
									show : true,
									textStyle : {
										fontSize : '30',
										fontWeight : 'bold'
									}
								},
								lableLine : {
									normal : {
										show : true,
										length : '5',
										length2 : '17',
									}
								},
							},
							data : [ {
								value : 335,
								name : '周会员'
							}, {
								value : 310,
								name : '月会员'
							}, {
								value : 234,
								name : '6月会员'
							}, {
								value : 135,
								name : '12月会员'
							} ]
						} ]
					};
					myChart.setOption(option);
					var myChart1 = echarts.init(document
							.getElementById('echarts_post1'));
					var option1 = {
						    baseOption: {
						        timeline: {
						            axisType: 'category',
						            autoPlay: true,
						            playInterval: 2500,
						            data: [
						                '2014年','2015年','2016年',
						            ],
						            label:{
						                normal:{
						                    'interval':0,//timeline的刻度标签间隔
						                },
						            },
						        },
						        title: {
									show: true,
									text: '客户分布情况',
									x:'left',
									y:'top',
									textStyle: {
										fontSize: 24,
										fontStyle: 'normal',
										fontWeight: 'bold',
									},
								},
						        tooltip: {
						        },
						        calculable : true,
						        grid: {
						            top: 80,
						            bottom: 100,
						            tooltip: {
						                trigger: 'axis',
						                axisPointer: {
						                    type: 'shadow',
						                    label: {
						                        show: true,
						                        formatter: function (params) {
						                            return params.value.replace('\n', '');
						                        }
						                    }
						                }
						            }
						        },

						        xAxis: [
						            {
						                'type':'category',
						                'axisLabel':{
						                    'interval':0,//横坐标刻度标签间隔为0
						                },
						                splitLine: {show: false}
						            }
						        ],
						        yAxis: [
						            {
						                type: 'value',
						            }
						        ],
						        series: [
						                 {name: '客户人数', type: 'bar'},
						             ]
						    },
						    options: [
						        {
						            xAxis:{data:['玄武区','白下区','秦淮区','建邺区','鼓楼区','下关区']},
						            series: [
						                {
						                	barWidth : 20,
						                    data: [2982.57,997.47,2149.75,992.69,811.47,2258.17],
						                }
						            ]
						        },
						        {
						            xAxis:{data:['玄武区','白下区','秦淮区','建邺区','鼓楼区','下关区']},
						            series : [
						                {
						                	barWidth : 20,
						                    data: [3435.95,1150.81,2439.68,1176.65,1000.79,2487.85],
						                }
						            ]
						        },
						        {
						            xAxis:{data:['玄武区','白下区','秦淮区','建邺区','鼓楼区','下关区']},
						            series : [
						                {
						                	barWidth : 20,
						                	data: [4092.27,1319.76,2805.47,1375.67,1270,2811.95]
						                },
						            ]
						        },
						    ]
						};
						myChart1.setOption(option1);
				},
			});

			module.exports = carlistPager
		});
