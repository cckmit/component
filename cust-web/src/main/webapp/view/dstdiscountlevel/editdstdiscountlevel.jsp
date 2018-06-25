<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>运营管理</title>
<%@ include file="/inc/inc.jsp"%>
<script
	src="${_base}/resources/spm_modules/ztree/jquery.ztree.all-3.5.min.js"></script>
<script
	src="${_base}/resources/spm_modules/ztree/zTreeStyle/zTreeStyle.css"></script>

</head>

<body>
	<form action="" id="dstDiscountLevelForm">
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
									<input value="${DstDiscountLevelInfo.levelId }" id="levelId"
										type="hidden">
									<ul>
										<li class="col-md-6">
											<p class="word">级别编码</p>
											<p>
												<input value="${DstDiscountLevelInfo.levelCode }"
													id="levelCode" name="levelCode" type="text"
													class="int-text int-medium"
													<c:if test="${not empty DstDiscountLevelInfo.levelId}">  readonly="readonly" style="border: 0px;"  </c:if>>
												<label for="levelCode"></label>
											</p>
										</li>
										<li class="col-md-6">
											<p class="word">级别名称</p>
											<p>
												<input value="${DstDiscountLevelInfo.levelName }"
													id="levelName" name="levelName" type="text"
													class="int-text int-medium"> <label for="levelName"></label>

											</p>
										</li>
										<li class="col-md-12">
											<p class="word">级别描述</p>
											<p>
												<textarea id="instructions" name="instructions"
													class="int-text textarea-xlarge" style="width: 190px;">${DstDiscountLevelInfo.instructions }</textarea>

												<label for="instructions"></label>
											</p>
										</li>
									</ul>
								</div>

								<!--白色背景-->
								<!-- 查询条件 -->
							<header class="main-box-header clearfix">
								<h5 class="pull-left">可绑定的权益：</h5>
							</header>
								<div class="zTreeDemoBackground">
									<ul id="treeDemo" class="ztree"></ul>
								</div>

								<!--白色背景-->
								<!-- 查询条件 -->
								<div class="form-label">
									<ul>
										<li class="col-md-6">
											<p class="word">&nbsp;</p>
											<p>
												<input type="button" class="btn-blue btn-medium ml-10"
													id="saveDiscountlevel" value="保存"> <input
													type="button" class="biu-btn btn-medium ml-10"
													id="selectDiscountlevelList" value="取消">
											</p>
										</li>
									</ul>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
<script type="text/javascript">
	var pager;
	var zTree;
	var count = '${count}';
	(function() {
		seajs.use([ 'app/jsp/dstdiscountlevel/editdstdiscountlevel' ], function(editdstdiscountlevelPager) {
			pager = new editdstdiscountlevelPager({
				element : document.body
			});
		});
	})();
	$(document).ready(function(){
		var zNodes=[
			<c:forEach items="${dstDiscountInfoTree}" var="menu">
			{
				id:"${menu.id}", pId:"${not empty menu.pId?menu.pId:0}", 
				name:"${menu.name}",
				type:"${menu.type}",
				open:true,
				isParent:${menu.type == 'clazz'},
				checked:"${menu.checked}"},
            </c:forEach>];	

		var setting = {
				check: {
					enable: true
				},
				data: {
					simpleData: {
						enable: true
					}
				}
			};
		zTree = $.fn.zTree.init($("#treeDemo"), setting, zNodes);
	});
</script>
</html>
