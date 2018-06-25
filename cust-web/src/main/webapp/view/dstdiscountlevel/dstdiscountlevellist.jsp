<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>级别列表</title>
<%@ include file="/inc/inc.jsp"%>
</head>
<body>

	<div class="content-wrapper-iframe">
		<!--右侧灰色背景-->
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
							<!-- 查询条件 -->
							<div class="form-label">
								<ul>
									<li class="col-md-6">
										<p class="word">级别编码</p>
										<p>
											<input id="discountId" type="text"
												class="int-text int-medium">
										</p>
									</li>
									<li class="col-md-6">
										<p class="word">级别名称</p>
										<p><input id="levelName" type="text" class="int-text int-medium"></p>
										<p>
											<input type="button"
												class="btn-blue btn-medium mr-10"
												id="selectDiscountList" value="查  询">
										</p>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
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
							<!--标题-->
							<header class="main-box-header clearfix">
								<h2 class="pull-left">级别列表</h2>
								<p class="word">&nbsp;</p>
								<p class="right pr-30">
									<input type="button"
										class="biu-btn  btn-primary btn-blue btn-medium ml-10"
										id="addDiscountLevel" value="新 建">
								</p>
							</header>
							<!--标题结束-->
							<div class="main-box-body clearfix">
								<!--table表格-->
								<div class="table-responsive clearfix">
									<table class="table table-hover table-border table-bordered">
										<thead>
											<tr>
												<th width="10%">级别编码</th>
												<th width="15%">级别名称</th>
<!-- 												<th width="40%">级别描述</th> -->
												<th width="15%">创建时间</th>
												<th width="20%">操作</th>
											</tr>
										</thead>
										<tbody id="searchDiscountData">
										</tbody>

									</table>
									<div id="showMessageDiv"></div>
									<script id="searchDiscountTemple" type="text/template">
									{{for result ~pageNo=pageNo ~pageSize=pageSize}}
									<tr>
										<td>{{:levelCode}}</td>
										<td>{{:levelName}}</td>
										<!--<td>{{:instructions}}</td> -->
										<td >{{:~timestampToDate('yyyy-MM-dd hh:mm:ss', createDate)}}</td>
                                        <td>
											<a href="javaScript:void(0)" style="color: #1295f2;" onclick="pager._showDelConf('{{:levelCode}}')" class="blue-border">删除</a>
											<a href="javaScript:void(0)" style="color: #1295f2;" onclick="pager._detailPage('{{:levelCode}}')" class="blue-border">查看详情</a>
											<a href="javaScript:void(0)" style="color: #1295f2;" onclick="pager._editPage('{{:levelCode}}')" class="blue-border">修改</a>
										</td>
									</tr>
									{{/for}}
								</script>
								</div>
								<!--分页-->
								<div class="paging">
									<ul id="pagination-ul">
									</ul>
								</div>
								<!--分页结束-->
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	var pager;
	var count = '${count}';
	var discountList = '${discountList}';
	var discountEditInfo = '${discountEditInfo}';
	(function() {
		seajs.use('app/jsp/dstdiscountlevel/dstdiscountlevellist', function(
				dstdiscountlevelPager) {
			pager = new dstdiscountlevelPager({
				element : document.body
			});
			pager.render();
		});
	})();
</script>
</html>