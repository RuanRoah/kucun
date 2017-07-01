<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList,com.bean.MaterialBean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>货物管理</title>
    
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
    ArrayList<MaterialBean> material=null; 
		if(request.getAttribute("material")!=null){
			material = (ArrayList<MaterialBean>)request.getAttribute("material");
		}
	%>
  <body>
  货物管理系统
    <table>
    <tr>
    <td>id</td>
    <td>货物名</td>
    <td>单位</td>
    <td>数量</td>
    
    </tr>
     <%
		if(material!=null)
		{
			for(MaterialBean m:material){%>
    		<tr>
		    <td><%=++i %></td>
		    <td><%=m.getMaterialname() %></td>
		    <td><%=m.getMaterialstatus() %></td>
		    <td><%=m.getMaterialnum() %></td>
		    
		    </tr>             	
                
         <%}         
         } %>
 	
    <a href="jump.do?val=1">添加入库</a>
    </table>
  </body>
</html>
