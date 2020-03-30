<%@ page language="java" contentType="text/html; charset=utf-8" isErrorPage="true" pageEncoding="utf-8"%>
<% 
	String basePath=request.getContextPath();
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>访问页面不存在！</title>
<style>
.all {
	width:600px;
	margin:100px auto;
	height:auto;
}

.all .img {
	height:247px;
	width:211px;
	background:url(../css/images/error/Err.gif);
	float:left
}

.all .data {
	float:right;
	text-align:center;
	width:300px;
	line-height:20px;
	padding-top:60px;
	font-size:14px;
}
</style>
<script type="text/javascript">
var now = 3;

function changeTime() {
	var con = now + "秒钟自动跳转到首页";
	document.getElementById("time").innerHTML = con;
	now--;
	setTimeout(changeTime,1000);
	if(now == 0) {
		window.location = "<%=basePath%>/login.html";
	}
}
</script>
</head>
<body>
<%   
  response.setStatus(HttpServletResponse.SC_OK);   
%>  
<div class="all">
<div class="img"></div>
<div class="data">
	您访问的页面不存在！<br/>
	<!--a href="javascript:history.go(-1)">返回上一层</a-->&nbsp;&nbsp;&nbsp;
	<a href="<%=basePath%>/login.do">返回首页</a><br/>
	<div id="time"></div><br/>
</div>
</div>
<script language="javascript">changeTime();</script>



</body>
</html>