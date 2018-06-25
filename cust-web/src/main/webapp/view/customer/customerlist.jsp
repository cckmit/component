<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
	<title>客户列表</title>
	<%@ include file="/inc/inc.jsp" %>
</head>

<body>

<!-- 锁定提示框 -->
<div class="eject-big">
    <div class="eject-medium" id="refuse-small">
       <!--  <div class="eject-medium-title">
            <p id="refuseCloseImg" class="img"><i class="fa fa-times"></i></p>
        </div> -->

        <div class="eject-medium-complete">
             <div class="form-label">
			<form id="prodAttrForm">
              <ul> 
                <li>
                   <p class="word">客户id:</p>
                   <p>
                   		<p id="custId_dialog" style="margin-left:10px;"></p>
                   </p>
              	 </li>
              	 <li>
                   <p class="word">认证状态:</p>
                   <p>
                   		<p id="state_dialog" style="margin-left:10px;"></p>
                   </p>
              	 </li>
          	 </ul>
	           <ul>	
	               <li>
	                   <p class="word">锁定原因:</p>
	                   <p><textarea id="lockDes" name="lockDes" class="int-text textarea-xlarge"
												  maxlength="100" style="width:190px;height:80px;" 
												  required data-msg-required="锁定原因不能为空"
												  commonText="/^[a-zA-Z_()0-9\u4e00-\u9fa5\-]+$/"
												  onblur="this.value=this.value.replace(/^\s+|\s+$/g,'')"></textarea>
	                   </p>
	                   
	               </li>
	           </ul>
         </form> 	 
		</div>
        </div>
        <!--按钮-->
        <div class="row mt-15"><!--删格化-->
            <p class="center pr-30 mt-30">
                <input id="lockBtn" type="button" class="biu-btn  btn-primary  btn-auto  ml-5" value="确认锁定">
                <input id="lockBtn-close" type="button" class="biu-btn  btn-primary  btn-auto  ml-5 " value="取  消">
            </p>
        </div>
    </div>
    <div class="mask" id="eject-mask"></div>
</div>
<!-- 锁定提示框结束 -->
<!-- 解锁提示框 -->
<div class="eject-big">
    <div class="eject-medium" id="refuse-small1">
       <!--  <div class="eject-medium-title">
            <p id="refuseCloseImg" class="img"><i class="fa fa-times"></i></p>
        </div> -->

        <div class="eject-medium-complete">
             <div class="form-label">
			<form id="prodAttrForm">
              <ul> 
                <li>
                   <p class="word">客户id:</p>
                   <p>
                   		<p id="custId_dialog1" style="margin-left:10px;"></p>
                   </p>
              	 </li>
              	 <li>
                   <p class="word">认证状态:</p>
                   <p>
                   		<p id="state_dialog1" style="margin-left:10px;"></p>
                   </p>
              	 </li>
          	 </ul>
	           <ul>	
	               <li>
	                   <p class="word">锁定原因:</p>
	                   <p><textarea id="lockDes1" name="lockDes" class="int-text textarea-xlarge"
												  maxlength="100" style="width:190px;height:80px;" 
												  required data-msg-required="锁定原因不能为空"
												  commonText="/^[a-zA-Z_()0-9\u4e00-\u9fa5\-]+$/"
												  onblur="this.value=this.value.replace(/^\s+|\s+$/g,'')"></textarea>
	                   </p>
	                   
	               </li>
	           </ul>
         </form> 	 
		</div>
        </div>
        <!--按钮-->
        <div class="row mt-15"><!--删格化-->
            <p class="center pr-30 mt-30">
                <input id="unlockBtn" type="button" class="biu-btn  btn-primary  btn-auto  ml-5" value="确认解锁">
                <input id="unlockBtn-close" type="button" class="biu-btn  btn-primary  btn-auto  ml-5 " value="取  消">
            </p>
        </div>
    </div>
    <div class="mask" id="eject-mask1"></div>
</div>
<!-- 解锁提示框结束 -->

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
									<p class="word">客户名称</p>
									<p><input id="custName" type="text" class="int-text int-medium"></p>
									<!-- <p class="sos"><a href="javascript:void(0);">高级搜索<i class="fa fa-caret-down"></i></a></p> -->
								</li>
								<li class="col-md-6">
									<p class="word">绑定手机</p>
									<p><input id="phone" type="text" class="int-text int-medium"></p>
								</li>
								<li class="col-md-6">
									<p class="word">认证状态</p>
									<p>
										<select id="state" class="select select-medium">
											<option value="">全部</option>
											<option value="0">未认证</option>
											<option value="1">已认证</option>
										</select>
									</p>
								</li>
								<li class="col-md-6">
									<p class="word">&nbsp;</p>
									<p><input type="button" class="biu-btn  btn-primary btn-blue btn-medium ml-10"
												  id="selectCustomerList" value="查  询"></p>
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
							<h2 class="pull-left">客户列表</h2>
						</header>
						<!--标题结束-->
						<div class="main-box-body clearfix">
							<!--table表格-->
							<div class="table-responsive clearfix">
								<table class="table table-hover table-border table-bordered">
									<thead>
									<tr>
										<th width="20%">客户名称</th>
										<th width="25%">客户ID</th>
										<th width="20%">认证状态</th>
										<th width="20%">绑定手机</th>
										<th width="15%">操作</th>
									</tr>
									</thead>
									<tbody id="searchCustomerData">
									</tbody>

								</table>
								<div id="showMessageDiv"></div>
								<script id="searchCustomerTemple" type="text/template">
									{{for result ~pageNo=pageNo ~pageSize=pageSize}}
									<tr>
										<td>{{:custName}}</td>
										<td>{{:custId}}</td>
										<td>
											{{if realNameAuthStatus=='0'}}
												未认证
											{{/if}}
											{{if realNameAuthStatus=='1'}}
												已认证
											{{/if}}
										</td>
										<td>{{:custPhoneNum}}</td>
                                        <td>
											<a href="${_base}/customer/{{:custId}}" style="color: #1295f2; class="blue-border">查看详情</a>
											{{if lockStatus=='0'}}
												<a href="javaScript:void(0)" style="color: #1295f2;" onclick="pager._showLockDialog('{{:custId}}','{{:realNameAuthStatus}}')" class="blue-border">锁定</a>
											{{/if}}
											{{if lockStatus=='1'}}
												<a href="javaScript:void(0)" style="color: #1295f2;" onclick="pager._showUnlockDialog('{{:custId}}',{{:realNameAuthStatus}},'{{:lockReason}}')" class="blue-border">解锁</a>
											{{/if}}
											<!-- <a href="javaScript:void(0)" onclick="pager._isDiscardDialog('{{:custId}}')" class="blue-border">注销</a> -->
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
	var customerList = '${customerList}';
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
		seajs.use(['app/jsp/customer/customerlist','app/util/center-hind'], function(storageList,centerHind) {
			pager = new storageList({element : document.body});
			pager.render();
			new centerHind({element : document.body}).render(); 
		});
	})();
</script>
</html>