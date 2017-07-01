<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList,com.bean.GoodsBean"%>
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
    ArrayList<GoodsBean> goods=null; 
		if(request.getAttribute("gg")!=null){
			goods = (ArrayList<GoodsBean>)request.getAttribute("gg");
		}
	%>
  <body>
  货物管理系统
    <table>
    <tr>
    <td>id</td>
    <td>货物名</td>
   	<td>货物介绍</td>
    <td>功能</td>
    </tr>
     <%
		if(goods!=null)
		{
			for(GoodsBean g:goods){%>
    		<tr>
		    <td><%=++i %></td>
		    <td><%=g.getGoodsname() %></td>
		    <td><%=g.getGoodsdetail() %></td>
		    <td><><a href="showplans.do?id=<%=g.getId() %>">检查需求</a></td>
		    </tr>             	
                
         <%}         
         } %>
 	
    
    </table>
  </body>
</html>
