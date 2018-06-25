<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
	<title>运营管理</title>
	<%@ include file="/inc/inc.jsp" %>
</head>


<body>

	<div class="content-wrapper-iframe"><!--右侧灰色背景-->
	<div class="row"><!--外围框架-->
            <div class="col-lg-12"><!--删格化-->
                <div class="row"><!--内侧框架-->
                    <div class="col-lg-12"><!--删格化-->
                        <div class="main-box clearfix"><!--白色背景-->
                        <form id="discountAddForm" action="${_base}/discount/save" method="post">
                        	<div class="main-box-body clearfix">	<!--padding20-->
                        	<!--标题开始--> 
                        	<!-- 类目链 -->
                            <header class="main-box-header clearfix">
                                <h5 class="pull-left"><c:choose><c:when test="${responseVo!=null}">修改</c:when><c:otherwise>添加</c:otherwise></c:choose>信息</h5>
                            </header>
                            <!--标题结束-->
                        	<div class="form-label bd-bottom">
					            <input type="hidden" id="discountId" name="discountId" value="${responseVo.discountId}"/>
					            
					            <ul>
					                <li class="width-xlag">
					                    <p class="word3"><b class="red">*</b>权益分类</p>
					                    <p>
					                    	<select required id="classCode" name="classCode" originClassCode="${responseVo.classCode}" class="select select-medium" >
					                    		<option value="">--请选择--</option>
					                    	</select>
					                    </p>
					                	<p id="error_productType"></p> 
					                </li>  
					            </ul> 
					            
					            <ul>
					                <li class="width-xlag">
					                    <p class="word3"><b class="red">*</b>权益编码</p>
					                    <p><input required id="discountCode" name="discountCode" type="text" maxlength='20' class="int-text int-xlarge"  
					                    value="${responseVo.discountCode}" 
					                    /></p>
					               	 	<p id="error_discountCode"></p> 
					                </li> 
					            </ul>
					            
					            <ul>
					                <li class="width-xlag">
					                    <p class="word3"><b class="red">*</b>权益名称</p>
					                    <p><input required id="discountName" name="discountName" type="text" maxlength='20' class="int-text int-xlarge"  
					                    value="${responseVo.discountName}"  commonText="/^[a-zA-Z_()0-9\u4e00-\u9fa5\-]+$/"
					                    onblur="this.value=this.value.replace(/^\s+|\s+$/g,'')"/></p>
					               	 	<p id="error_discountName"></p> 
					                </li> 
					            </ul>
					            
					             <ul>
					                <li class="width-xlag">
					                    <p class="word3"><b class="red">*</b>权益类型</p>
					                    <p>
					                    	<select required id="discountType" name="discountType" originDiscountType="${responseVo.discountType}" class="select select-medium">
					                    		<option value="">--请选择--</option>
					                    	</select>
					                    </p>
					                	<p id="error_productType"></p> 
					                </li>  
					            </ul> 
					            
					            <ul>
					                <li class="width-xlag">
					                    <p class="word3"><b class="red">*</b>权益生效时长</p>
					                    <p><input required id="effectiveTime" name="effectiveTime" type="text" maxlength='10' class="int-text int-xlarge"  
					                    value="${responseVo.effectiveTime}"   regexp="^[0-9]*$"
                                        data-msg-regexp="权益生效时长只能为数字" 
					                    /></p>
					               	 	<p id="error_effectiveTime"></p> 
					                </li> 
					            </ul>
					            
					            <ul>
					                <li class="width-xlag">
					                    <p class="word3"><b class="red">*</b>权益生效时长单位</p>
					                    <p>
					                    	<select required id="effectiveUnit" name="effectiveUnit" originEffectiveUnit="${responseVo.effectiveUnit}" class="select select-medium" >
					                    		<option value="">--请选择--</option>
					                    	</select>
					                    </p>
					                	<p id="error_productType"></p> 
					                </li>  
					            </ul> 
					            
					            <ul>
					                <li class="width-xlag">
					                    <p class="word3">权益说明</p>
					                    <p><textarea style="width:550px;height:100px;" id="discountInstructions" name="discountInstructions" maxlength='200'   
					                    type="textarea" class="int-text textarea-xlarge">${responseVo.discountInstructions}</textarea></p>
					               	 	<p id="error_productName"></p> 
					                </li> 
					            </ul>
					        </div> 
							
								<!--标题开始--> 
						       <%--  <header class="main-box-header clearfix ">
	                            	<h5 class="pull-left">权益级别</h5>
	                            </header> 
	                            <!--标题结束--> 
	                            <div class="form-label  bd-bottom"> 
		                            <ul>
						                <li class="width-xlag">
				                            <p class="word3"><b class="red">*</b>状态</p>
				                            <p>
				                            	<select required id="state" name="state" class="select select-medium">
								                   	<option value="1"<c:if test="${productInfo.state == '1'}">selected="selected"</c:if>>可使用</option>
								                   	<option value="2"<c:if test="${productInfo.state == '2'}">selected="selected"</c:if>>不可使用</option>
						                    	</select>
				                            </p>
				                        </li>
				                    </ul>
				                 </div> --%>
				                 
				         <div class="main-box-body clearfix">
                        <div class="table-responsive clearfix relation-special">
                            <table width="100%" border="0" class="table table-hover  table-bordered table-special">
                                <thead>
                                <tr class="bj">
                                    <th colspan="2" style="text-align:left; padding-left:10px;">权益主体限定关系</th>
                                </tr>
                                </thead>
                            
                                <tbody>
                                <!--点击展开-->
                                <tr>
                                    <td colspan="2" class="click">
                                        <!--点击行为层-->
                                        <table width="100%" border="0">
                                            <tbody><tr class="click">
                                                <td width="2%" class="ahref border-bot-none">
                                                    <a href="javaScript:void(0);"><i class="fa fa-plus"></i></a></td>
                                                <td width="1%" class="ctr1 text-c border-bot-none">
                                                    <input name="attrCheck" type="checkbox" class="margin-checkbox" value="263">
                                                </td>
                                                <td width="20%" class="ctr text-l border-bot-none">全选</td>
                                            </tr>
                                        </tbody></table>
                                    </td>
                                    <!--点击行为层结束-->
                                </tr>
                                <!--点击行为表现层-->
                                    
                                <tr class="zhank" style="display: none;">
                                    <td colspan="1">
                                        <table width="100%" border="0">
                                            <tbody><tr>
                                                <td colspan="2" class="border-bot-none">
                                                    <div class="relation-table-div" id="relation-table-div">
                                                    				<c:forEach var="ownerLimit" items="${responseVo.ownerLimitResponseVos}" >
                                                    					<input type="hidden" name="originOwnerLimit" value="${ownerLimit.ownerCode}"/>
                                                        			</c:forEach>
                                                    </div>
                                                </td>
                                            </tr>
                                        </tbody></table>
                                    </td>
                                </tr>
                                
                                <!--点击行为表现层结束-->
                                </tbody>
                                    </table>
                                    </div>
                                    <!--/table表格结束-->
                                </div>
				                 
				                 
				                 
								<div id="subDiv" class="row pt-30">
	                            	<p class="center pr-30 mt-30">
	                            		<input id="saveDiscount" type="button" class="biu-btn  btn-primary  btn-small  ml-5"
	                                           value="保  存">
	                                    <input id="cancel" type="button" class="biu-btn  btn-primary  btn-small  ml-5"
	                                           value="返  回" onclick="javaScript:window.history.go(-1);">
	                            	</p>
	                            </div>
	                        </div>
	                        </form>
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
		seajs.use('app/jsp/discount/add', function(addPager) {
			pager = new addPager({element : document.body});
			pager.render();
		});
	})();
	
</script>
</html>
