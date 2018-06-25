<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
	<title>权益列表</title>
	<%@ include file="/inc/inc.jsp" %>
</head>

<body>
 <!--头部和菜单-->
<!--头部和菜单结束-->



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
					            
					            <ul>
					                <li class="width-xlag">
					                    <p class="word3"><b class="red">*</b>账期</p>
					                    <p><input required id="accountPeriod" name="accountPeriod" type="text" maxlength='20' class="int-text int-xlarge"  
					                    value="" 
					                    /></p>
					               	 	<p id="error_discountCode"></p> 
					                </li> 
					            </ul>
					            
					            <ul>
                  <li class="btn-margin"><p class="word">&nbsp;</p><p><a href="javascript:void(0);">选择本地上传文件<input id="uploadFile" type="file" class="flie"></a><br>请选择Zip格式文件包，上传文件不能超过10M</p></li>
                 </ul>
					           
					            
					            
					        </div> 
							
				                 
				                 
				                 
								<div id="subDiv" class="row pt-30">
	                            	<p class="center pr-30 mt-30">
	                            		<input id="uploadBtn" type="button" class="biu-btn  btn-primary  btn-small  ml-5"
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
  
  <script type="text/javascript">
  	var pager;
	(function () {
		seajs.use('app/jsp/account/uploadAccount', function (UploadAccountPager) {
			pager = new UploadAccountPager({element: document.body});
			pager.render();
		});
	})();
  </script>
</body>
</html>
