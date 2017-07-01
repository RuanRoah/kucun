<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList,com.bean.RoleBean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>货物管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%
  int i=0;
    ArrayList<RoleBean> role=null; 
		if(request.getAttribute("role")!=null){
			role = (ArrayList<RoleBean>)request.getAttribute("role");
		}
	%>
  <body>
  货物管理系统
    <ul>
     <%
		if(role!=null)
		{
			for(RoleBean r:role){%>
                 	<li><a href="<%=r.getRolehref() %>"><%=r.getRolename() %></a></li>
                
         <%}         
         } %>
 	
    
    </ul>
  </body>
</html>
