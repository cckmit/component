<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>客户详细信息</title>
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
								<!-- 类目链 -->
								<header class="main-box-header clearfix">
									<h5 class="pull-left">客户详细信息</h5>
								</header>
								<!--标题结束-->
								<div class="form-label  bd-bottom">
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">客户ID：</p>
											<p id="custId">${custId}</p>
											
											<p class="word3">客户姓名：</p>
											<p>${custFullInfo.custName}</p>
										</li>
									</ul>
									<%-- <ul class="big-word">
										<li class="col-md-12">
											<p class="word3">租户ID：</p>
											<p>${custFullInfo.tenantId}</p>
										</li>
									</ul> --%>
									<%-- <ul class="big-word">
										<li class="col-md-6">
											<p class="word3">客户姓名：</p>
											<p>${custFullInfo.custName}</p>
										</li>
									</ul> --%>
									<%-- <ul>
										<li class="col-md-12">
											<p class="word3">客户编码：</p>
											<p>${custFullInfo.custCode}</p>
										</li>
									</ul> --%>
									<ul>
										<li class="col-md-12">
											<p class="word3">客户手机号码：</p>
											<p>${custFullInfo.custPhoneNum}</p>
											
											<p class="word3">认证状态：</p> <c:if
												test="${custFullInfo.realNameAuthStatus == 0 }">
												<p>未认证</p>
											</c:if> <c:if test="${custFullInfo.realNameAuthStatus == 1 }">
												<p>认证成功</p>
											</c:if> <c:if test="${custFullInfo.realNameAuthStatus == 2 }">
												<p>认证失败</p>
											</c:if>
										</li>
									</ul>
									<%-- <ul>
										<li class="col-md-12">
											<p class="word3">认证状态：</p> <c:if
												test="${custFullInfo.verifyFlag == 0 }">
												<p>未认证</p>
											</c:if> <c:if test="${custFullInfo.verifyFlag == 1 }">
												<p>认证成功</p>
											</c:if> <c:if test="${custFullInfo.verifyFlag == 2 }">
												<p>认证失败</p>
											</c:if>
										</li>
									</ul> --%>
									<%-- <ul>
										<li class="col-md-12">
											<p class="word3">认证状态：</p> <c:if
												test="${custFullInfo.realNameAuthStatus == 0 }">
												<p>未认证</p>
											</c:if> <c:if test="${custFullInfo.realNameAuthStatus == 1 }">
												<p>认证成功</p>
											</c:if> <c:if test="${custFullInfo.realNameAuthStatus == 2 }">
												<p>认证失败</p>
											</c:if>
										</li>
									</ul> --%>
									<%-- <ul>
										<li class="col-md-12">
											<p class="word3">客户状态：</p> <c:if
												test="${custFullInfo.state == 1 }">
												<p>正常</p>
											</c:if> <c:if test="${custFullInfo.state == 2 }">
												<p>未返档</p>
											</c:if> <c:if test="${custFullInfo.state == 3 }">
												<p>注册</p>
											</c:if> <c:if test="${custFullInfo.state == 4 }">
												<p>欠费</p>
											</c:if> <c:if test="${custFullInfo.state == 5 }">
												<p>冻结</p>
											</c:if>
										</li>
									</ul> --%>
									<%-- <ul>
										<li class="col-md-12">
											<p class="word3">状态变更时间：</p>
											<p>${stateChgTime}</p>
										</li>
									</ul> --%>
									<ul>
										<li class="col-md-12">
											<p class="word3">状态变更时间：</p>
											<p>${stateChgTime}</p>
											
											<p class="word3">创建时间：</p>
											<p>${createTime}</p>
										</li>
									</ul>
									<%-- <ul>
										<li class="col-md-12">
											<p class="word3">锁定状态：</p> <c:if
												test="${custFullInfo.lockStatus == 0 }">
												<p>未锁定</p>
											</c:if> <c:if test="${custFullInfo.lockStatus == 1 }">
												<p>锁定</p>
											</c:if>
										</li>
									</ul> --%>
									
									<c:if test="${custFullInfo.certInfo != null }">
											<ul>
												<li class="col-md-12">
													<p class="word3">证件类型：</p> 
													<c:if test="${custFullInfo.certInfo.certType == '01' }">
														<p>身份证</p>
													</c:if>
													
													<p class="word3">证件号码：</p> 
														<p>${custFullInfo.certInfo.certNum }</p>
												</li>
											</ul>
											
											<%-- <ul>
												<li class="col-md-12">
													<p class="word3">证件号码：</p> 
														<p>${custFullInfo.certInfo.certNum }</p>
												</li>
											</ul> --%>
									</c:if>
									
									<ul>
										<li class="col-md-12">
											<p class="word3">锁定原因：</p>
											<p>${custFullInfo.lockReason}</p>
											
											<p class="word3">锁定状态：</p> <c:if
												test="${custFullInfo.lockStatus == 0 }">
												<p>未锁定</p>
											</c:if> <c:if test="${custFullInfo.lockStatus == 1 }">
												<p>锁定</p>
											</c:if>
										</li>
									</ul>
								</div>
								<header class="main-box-header clearfix">
									<h5 class="pull-left">车辆绑定信息</h5>
								</header>
								<div class="form-label  bd-bottom">
									<table class="table table-hover table-border table-bordered">
										<thead>
											<tr>
												<th width="20%">车辆ID</th>
												<th width="15%">品牌</th>
												<th width="20%">型号</th>
												<th width="10%">车牌</th>
												<th width="10%">状态</th>
											</tr>
										</thead>
										<tbody id="searchCarInfoData">
										</tbody>
										
									</table>
									<div id="showMessageDiv"></div>
									<script id="searchCarTemple" type="text/template">
									{{for result ~pageNo=pageNo ~pageSize=pageSize}}
									<tr>
										<td>{{:id}}</td>
										<td>{{:brand}}</td>
										<td>{{:carType}}</td>
										<td>{{:carNum}}</td>
                                        <td>
											{{if verifyState=='0'}}
												未认证
											{{/if}}
											{{if verifyState=='1'}}
												已认证
											{{/if}}
										</td>
									</tr>
									{{/for}}
								</script>
									
								</div>
							</div>
							<div id="subDiv" class="row pt-30">
								<p class="center pr-30 mt-30">
									<input type="button"
										class="biu-btn  btn-primary  btn-small  ml-5" value="返  回"
										onclick="javaScript:window.history.go(-1);">
								</p>
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
	var count = '${count}';
	var carList = '${carList}';
	var customerEditInfo = '${customerEditInfo}';
	(function () {
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
		seajs.use(['app/jsp/customer/info','app/util/center-hind'], function(storageList,centerHind) {
			pager = new storageList({element : document.body});
			pager.render();
			new centerHind({element : document.body}).render(); 
		});
	})();
</script>
</html>
