<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>运营管理</title>
<%@ include file="/inc/inc.jsp"%>
<script type="text/javascript" src="${uedroot}/scripts/modular/fold.js"></script>
<script
	src="${_base}/resources/spm_modules/ztree/jquery.ztree.all-3.5.min.js"></script>
<script
	src="${_base}/resources/spm_modules/ztree/jquery.ztree.exhide-3.5.min.js"></script>
<style type="text/css">
.word4 {width:200px; text-align: left;}
.word5 {width:400px; text-align: left;}
</style>	

</head>
<body>
	<div class="content-wrapper-iframe">
		<!--右侧灰色背景-->
		<!--框架标签结束-->
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
								<h5 class="pull-left">级别详情：</h5>
							</header>
							<!--标题结束-->
							<c:if test="${DstDiscountLevelInfo!=null}">
								<!--标题结束-->
								<div class="form-label  bd-bottom">
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">级别编码：</p>
											<p class="word4">${DstDiscountLevelInfo.levelCode}</p>

										</li>
									</ul>
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">级别名称：</p>
											<p class="word4">${DstDiscountLevelInfo.levelName}</p>

										</li>
									</ul>
									<ul class="big-word">
										<li class="col-md-12">
											<p class="word3">级别描述：</p>
											<p class="word5">
												${DstDiscountLevelInfo.instructions}
											</p>

										</li>
									</ul>
								</div>

							</c:if>


							<div class="main-box-body clearfix">
								<!--/table表格结束-->
							</div>
							<header class="main-box-header clearfix">
								<h5 class="pull-left">已绑定的权益：</h5>
							</header>

							<div class="zTreeDemoBackground">
								<ul id="treeDemo" class="ztree"></ul>
							</div>


							<div class="row pt-30">
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
</body>
<script type="text/javascript">

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
				enable: false
			},
			data: {
				simpleData: {
					enable: true
				}
			}
		};
	zTree = $.fn.zTree.init($("#treeDemo"), setting, zNodes);
	function filter(node) {
	    return (node.level == 1 && !node.checked);
	}
	var unchecknodes = zTree.getNodesByFilter(filter); // 查找节点集合
	zTree.hideNodes(unchecknodes);
});
</script>
</html>
