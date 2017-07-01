<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList,com.bean.PlansBean"%>
<%@page import="java.util.ArrayList,com.bean.GoodsBean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>生产计划管理</title>
    
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
    ArrayList<PlansBean> plans=null; 
		if(request.getAttribute("plans")!=null){
			plans = (ArrayList<PlansBean>)request.getAttribute("plans");
		}
	%>
  <body>
  材料入库管理
  
  <%
  
 	 GoodsBean g=(GoodsBean)request.getAttribute("goods"); %>
 	 <%=g.getGoodsname() %>
    <table>
    <tr>
    <td>id</td>
    <td>材料名</td>
    <td>材料名称</td>
    <td>所需材料</td>
    <td>材料数量</td>
    <td>库存数量</td>
    
    </tr>
     <%
     String res="不可生产";
		if(plans!=null)
		{
			for(PlansBean p:plans){%>
    		<tr>
		    <td>id</td>
			    <td><%=++i %></td>
			    <td><%=p.getMaterialname() %></td>
			    <td><%=p.getMaterialneednum() %></td>
			    <td><%=p.getMaterialnum() %></td>
			  	
			    <%
			    	int a=Integer.parseInt(p.getMaterialneednum());
			    	int b=Integer.parseInt(p.getMaterialnum());
			    	if(a<=b)
			    		res="可以生产";
			    	
			     %>
		    </tr>             	
               
         <%}         
         } %>
 	
    <%=res%>
    </table>
  </body>
</html>
