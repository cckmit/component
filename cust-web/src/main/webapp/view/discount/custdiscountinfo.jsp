<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>客户权益详细信息</title>
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
									<h5 class="pull-left">客户权益详细信息</h5>
								</header>
								<!--标题结束-->
								<div class="form-label  bd-bottom">
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">权益ID：</p>
											<p id="discountId">${custDiscountResponseVo.discountId}</p>

										</li>
									</ul>
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">权益编码：</p>
											<p>${custDiscountResponseVo.discountCode}</p>
										</li>
									</ul>

									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">权益名称：</p>
											<p>${custDiscountResponseVo.discountInfoResponseVo.discountName}</p>
										</li>
									</ul>
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">客户id：</p>
											<p>${custDiscountResponseVo.custId}</p>
										</li>
									</ul>
									 <ul class="big-word">
										<li class="col-md-12">
											<p class="word3">主体编码：</p>
											<p>${custDiscountResponseVo.ownerCode}</p>
										 </li>
									</ul>
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">主体实例编码：</p>
											<p>${custDiscountResponseVo.ownerInstanceCode}</p>
										</li>
									</ul>
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">购买时间：</p>
											<p><fmt:formatDate value="${discountPayDate}" pattern="yyyy-MM-dd HH:mm:ss"/></p>
										</li>
									</ul>
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">激活日期：</p>
											<p><fmt:formatDate value="${activeDate}" pattern="yyyy-MM-dd HH:mm:ss"/></p>
										</li>
									</ul>
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">权益生效日期：</p>
											<p><fmt:formatDate value="${effectiveDate}" pattern="yyyy-MM-dd HH:mm:ss"/></p>
										</li>
									</ul>
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">权益失效日期：</p>
											<p><fmt:formatDate value="${expirationDate}" pattern="yyyy-MM-dd HH:mm:ss"/></p>
										</li>
									</ul>
                                    <ul class="big-word">
                                        <li class="col-md-12">
                                            <p class="word3">级别编码：</p>
                                            <p>${custDiscountResponseVo.custLevelInstanceResponseVo.levelCode}</p>
                                        </li>
                                    </ul>
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">级别名称：</p>
											<p>${custDiscountResponseVo.custLevelInstanceResponseVo.discountLevelResponseVo.levelName}</p>
										</li>
									</ul>
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">备注：</p>
											<p>${custDiscountResponseVo.remark}</p>
										</li>
									</ul>
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
		seajs.use(['app/jsp/discount/custdiscountinfo','app/util/center-hind'], function(storageList,centerHind) {
			pager = new storageList({element : document.body});
			pager.render();
			new centerHind({element : document.body}).render(); 
		});
	})();
</script>
</html>
