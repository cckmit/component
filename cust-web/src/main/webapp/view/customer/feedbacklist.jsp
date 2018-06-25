<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
	<title>客户意见反馈列表</title>
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
									<p><input id="custId" type="text" class="int-text int-medium"></p>
									<!-- <p class="sos"><a href="javascript:void(0);">高级搜索<i class="fa fa-caret-down"></i></a></p> -->
								</li>
								<li class="col-md-6">
									<p class="word">留言内容</p>
									<p><input id="content" type="text" class="int-text int-medium"></p>
									<!-- <p class="sos"><a href="javascript:void(0);">高级搜索<i class="fa fa-caret-down"></i></a></p> -->
								</li>
							</ul>
							<ul>
								<li class="col-md-6">
									<p class="word">创建开始时间</p>
									<p><input type="text" class="int-text int-medium" id="createDateStart"
											  readonly="true" onfocus="WdatePicker({readOnly:true});">
										<span class="time"> <i class="fa  fa-calendar" ></i></span></p>
								</li>
								<li class="col-md-6">
									<p class="word">创建结束时间</p>
									<p><input type="text" class="int-text int-medium" id="createDateEnd"
											  readonly="true" onfocus="WdatePicker({readOnly:true})">
										<span class="time"> <i class="fa  fa-calendar" ></i></span>
									</p>
									<p><input type="button" class="biu-btn  btn-primary btn-blue btn-medium ml-10"
												  id="selectFeedbackList" value="查  询"></p>
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
							<h2 class="pull-left">客户意见反馈列表</h2>
						</header>
						<!--标题结束-->
						<div class="main-box-body clearfix">
							<!--table表格-->
							<div class="table-responsive clearfix">
								<table class="table table-hover table-border table-bordered">
									<thead>
									<tr>
										<th width="10%">客户ID</th>
										<th width="20%">客户名称</th>
										<th width="20%">创建时间</th>
										<th width="50%">意见反馈内容</th>
									</tr>
									</thead>
									<tbody id="searchFeedbackData">
									</tbody>

								</table>
								<div id="showMessageDiv"></div>
								<script id="searchFeedbackTemple" type="text/template">
									{{for result ~pageNo=pageNo ~pageSize=pageSize}}
									<tr>
										<td>{{:custId}}</td>
										<td>{{:custName}}</td>
										<td>{{:createDateStr}}</td>
										<td style="text-align: left;">
											{{if content.length >= 38}}
												<p title="{{:content}}">{{:content.substring(0,38)}}...</p>
											{{/if}}
                                            {{if content.length < 38}}
												{{:content}}
											{{/if}}
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
		<%-- 展示日历 --%>
		$('#selectDiv').delegate('.fa-calendar','click',function(){
			var calInput = $(this).parent().prev();
			var timeId = calInput.attr('id');
			WdatePicker({el:timeId,readOnly:true});
		});
		<%-- 高级区域 --%>
		/* $(".form-label ul li .sos a").click(function () {
			$(".open ").slideToggle(100);
			$(".nav-form ").toggleClass("reorder remove");
		}); */
		seajs.use(['app/jsp/customer/feedback','app/util/center-hind'], function(storageList,centerHind) {
			pager = new storageList({element : document.body});
			pager.render();
			new centerHind({element : document.body}).render(); 
		});
	})();
</script>
</html>