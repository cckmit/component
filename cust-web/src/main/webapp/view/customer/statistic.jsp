<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>客户统计视图</title>
<%@ include file="/inc/inc.jsp"%>
</head>

<body>
	<div class="content-wrapper-iframe">
		<!--外围框架-->
		<div class="row">
			<!--外围框架-->
			<div class="col-lg-12">
				<!--删格化-->
				<div class="row">
					<!--内侧框架-->
					<div class="col-lg-12">
						<!--删格化-->
						<div class="main-box clearfix">
							<!--白色背景-->
							<div class="main-box-body clearfix">
								<div
									style="width: 50%; height: 700px; padding-top: 2%; float: left;">
									<div id="echarts_post" style="width: 100%; height: 85%;"></div>
								</div>
								<div
									style="width: 50%; height: 600px; padding-top: 2%; float: left;">
									<div id="echarts_post1" style="width: 100%; height: 50%;"></div>
									<div>
										<div style="margin-top: 5%; margin-left: 2%; height: 10%">
											<p style="font-size: 24px; font-weight: bold;">注册总数</p>
										</div>
										<div style="margin-top: 5%;margin-left: 2%;height: 15%">
											<div style="float: left; width: 30%;font-size:22px;font-weight:bold;" >
												<div class="point point-primary point-lg"></div>
												浦口区
											</div>
											<div style="margin-top:-2%;float: left; width: 30%;font-size:22px;font-weight:bold;" >
												<div>
													<span style="font-size:18px; font-weight:bold">2100</span>
												</div>
												<div>
													<span style="color:#BDBDBD">注册总数</span>
												</div>
											</div>
											<div style="float: left; width: 30%;">
												<div>
													<span style="color:#BDBDBD">百分比</span>
													<span style="margin-left:50%">20%</span>
												</div>
												<div class="progress progress-total">
													<div class="progress-bar" role="progressbar"
														style="width: 20%;"></div>
												</div>
											</div>
										</div>
										<div style="margin-top: 15%; margin-left: 2%;height: 15%">
											<div style="float: left; width: 30%;font-size:22px;font-weight:bold;">
												<div class="point point-primary point-lg"></div>
												六合区
											</div>
											<div style="margin-top:-2%;float: left; width: 30%;font-size:22px;font-weight:bold;" >
												<div>
													<span style="font-size:18px; font-weight:bold">1916</span>
												</div>
												<div>
													<span style="color:#BDBDBD">注册总数</span>
												</div>
											</div>
											<div style="float: left; width: 30%;">
												<div>
													<span style="color:#BDBDBD">百分比</span>
													<span style="margin-left:50%">19%</span>
												</div>
												<div class="progress progress-total">
													<div class="progress-bar" role="progressbar"
														style="width: 19%;"></div>
												</div>
											</div>
										</div>
										<div style="margin-top: 15%;margin-left: 2%; height: 15%">
											<div style="float: left; width: 30%;font-size:22px;font-weight:bold;">
												<div class="point point-primary point-lg"></div>
												栖霞区
											</div>
											<div style="margin-top:-2%;float: left; width: 30%;font-size:22px;font-weight:bold;" >
												<div>
													<span style="font-size:18px; font-weight:bold">1916</span>
												</div>
												<div>
													<span style="color:#BDBDBD">注册总数</span>
												</div>
											</div>
											<div style="float: left; width: 30%;">
												<div>
													<span style="color:#BDBDBD">百分比</span>
													<span style="margin-left:50%">19%</span>
												</div>
												<div class="progress progress-total" >
													<div class="progress-bar" role="progressbar"
														style="width: 19%;"></div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- footer -->
</body>
<script type="text/javascript">
	var pager;
	(function() {
<%-- 展示日历 --%>
	/* $('#selectDiv').delegate('.fa-calendar','click',function(){
						var calInput = $(this).parent().prev();
						var timeId = calInput.attr('id');
						console.log("click calendar "+timeId);
						WdatePicker({el:timeId,readOnly:true});
					}); */
<%-- 高级区域 --%>
	/* $(".form-label ul li .sos a").click(function () {
						$(".open ").slideToggle(100);
						$(".nav-form ").toggleClass("reorder remove");
					}); */
		seajs.use([ 'app/jsp/customer/statistic', 'app/util/center-hind' ],
				function(storageList, centerHind) {
					pager = new storageList({
						element : document.body
					});
					pager.render();
					new centerHind({
						element : document.body
					}).render();
				});
	})();
</script>
</html>
