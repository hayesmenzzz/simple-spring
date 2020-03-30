<%@ page pageEncoding="UTF-8"%><% 
	response.addHeader("__forbidden","true");
	String basePath=request.getContextPath();
%>
<html>
	<head>
		<title>访问拒绝</title>
			<style type="text/css">
			<!--
			.STYLE10 {
				font-family: "黑体";
				font-size: 36px;
			}
			-->  
			</style>
	</head>
	<body>
	 <table width="510" border="0" align="center" cellpadding="0" cellspacing="0">
	  <tr>
    	<td><img src="<%=basePath%>/css/images/error/error_top.jpg" width="510" height="80" /></td>
  	  </tr>
	  <tr>
	    <td height="200" align="center" valign="top" background="<%=basePath%>/css/images/error/error_bg.jpg">
	    	<table width="80%" border="0" cellspacing="0" cellpadding="0">
	        <tr>
	          <td width="34%" align="right"><img src="<%=basePath%>/css/images/error/error.gif" width="128" height="128"></td>
	          <td width="66%" valign="bottom" align="center">
	          	<span class="STYLE10">访问被拒绝</span>
	          	<div style="text-align: left;line-height: 22px;">
	            <font size="2">对不起，您没有查看此页面的权限。请联系您的系统管理员，以获得相应的权限。</font>
		        </div>
		        <a href="#" onclick="javascript:document.location.href='<%=basePath%>/index.do';">返回首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
		        <!--a href="#" onclick="javascript:history.back(-1);">后 退</a-->
	     	 </td>
	      </table>
	      </td>
	  </tr>    	 
	  <tr>
    	<td><img src="<%=basePath%>/css/images/error/error_bootom.jpg" width="510" height="32" /></td>
      </tr>
	</table>
	
	
	</body>
</html>