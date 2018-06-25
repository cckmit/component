<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
	<title>客户权益列表</title>
	<%@ include file="/inc/inc.jsp" %>
</head>

<body>

<div class="content-wrapper-iframe"><!--右侧灰色背景-->
	<div class="row"><!--外围框架-->
		<div class="col-lg-12"><!--删格化-->
			<div class="row"><!--内侧框架-->
				<div class="col-lg-12"><!--删格化-->
					<div class="main-box clearfix"><!--白色背景-->
						<!-- 查询条件 -->
						<div class="form-label">
							<ul>
								<li class="col-md-6">
									<p class="word">客户id</p>
									<p><input id="custId" type="text" required class="int-text int-medium"></p>
									<!-- <p class="sos"><a href="javascript:void(0);">高级搜索<i class="fa fa-caret-down"></i></a></p> -->
								</li>
								<li class="col-md-6">
									<p class="word">客户名称</p>
									<p><input id="custName" type="text" required class="int-text int-medium"></p>
								</li>
								<li class="col-md-6">
									<p class="word">权益编码</p>
									<p><input id="discountCode" type="text" required class="int-text int-medium"></p>
								</li>
								<li class="col-md-6">
									<p class="word">权益名称</p>
									<p><input id="discountName" type="text" required class="int-text int-medium"></p>
								</li>
								<li class="col-md-6">
									<p class="word">主体编码</p>
									<p>
										<select id="ownerCode" class="select select-medium">
											<option value="">全部</option>
											<%--<option value="car">车辆</option>
											<option value="persion">人员</option>--%>
										</select>
									</p>
								</li>
								<li class="col-md-6">
									<p class="word">主体实例编码</p>
									<p><input id="ownerInstanceCode" type="text" class="int-text int-medium"></p>
								</li>
								<li class="col-md-6">
									<p class="word">权益状态</p>
									<p>
										<select id="activeStatus" class="select select-medium">
											<option value="">全部</option>
											<option value="1">生效</option>
											<option value="2">失效</option>
										</select>
									</p>
								</li>
								<li class="col-md-6">
									<p class="word">&nbsp;</p>
									<p><input type="button" class="biu-btn  btn-primary btn-blue btn-medium ml-10"
												  id="selectCustDisconutList" value="查  询"></p>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row"><!--外围框架-->
		<div class="col-lg-12"><!--删格化-->
			<div class="row"><!--内侧框架-->
				<div class="col-lg-12"><!--删格化-->
					<div class="main-box clearfix"><!--白色背景-->
						<!--标题-->
						<header class="main-box-header clearfix">
							<h2 class="pull-left">客户权益列表</h2>
						</header>
						<!--标题结束-->
						<div class="main-box-body clearfix">
							<!--table表格-->
							<div class="table-responsive clearfix">
								<table class="table table-hover table-border table-bordered">
									<thead>
									<tr>
										<th>实例ID</th>
										<th>权益ID</th>
										<th>权益编码</th>
										<th>权益名称</th>
										<th>客户ID</th>
                                        <th>客户名称</th>
										<th>主体编码</th>
										<th>主体实例编码</th>
										<th>权益生效日期</th>
										<th>权益失效日期</th>
										<th>权益状态</th>
										<th>操作</th>
									</tr>
									</thead>
									<tbody id="searchCustdiscountData">
									</tbody>

								</table>
								<div id="showMessageDiv"></div>
								<script id="searchCustdiscountTemple" type="text/template">
									{{for result ~pageNo=pageNo ~pageSize=pageSize}}
									<tr>
										<td>{{:instanceId}}</td>
										<td>{{:discountId}}</td>
										<td>{{:discountCode}}</td>
										<td>{{:discountInfoResponseVo.discountName}}</td>
										<td>{{:custId}}</td>
                                        <td>{{:custName}}</td>
										<td>{{:ownerCode}}</td>
										<td>{{:ownerInstanceCode}}</td>
										<td>{{:~timestampToDate('yyyy-MM-dd hh:mm:ss', effectiveDate)}}</td>
										<td>{{:~timestampToDate('yyyy-MM-dd hh:mm:ss', expirationDate)}}</td>
                                        <td>
											{{if activeStatus=='1'}}
											生效
											{{/if}}
											{{if activeStatus=='2'}}
											失效
											{{/if}}
										</td>
										<td>
											<a href="${_base}/discount/{{:instanceId}}" style="color: #1295f2;" class="blue-border">查看详情</a>
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
	(function () {

		seajs.use(['app/jsp/discount/custdiscountlist','app/util/center-hind'], function(storageList,centerHind) {
			pager = new storageList({element : document.body});
			pager.render();
			new centerHind({element : document.body}).render(); 
		});
	})();
</script>
</html>