<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList,com.bean.BuysBean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>材料入库管理</title>
    
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
    ArrayList<BuysBean> buys=null; 
		if(request.getAttribute("buys")!=null){
			buys = (ArrayList<BuysBean>)request.getAttribute("buys");
		}
	%>
  <body>
  材料入库管理
    <table>
    <tr>
    <td>id</td>
    <td>材料名</td>
    <td>材料数量</td>
    <td>材料单位</td>
    <td>材料单价</td>
    <td>材料状态</td>
    <td>更改状态</td>
    </tr>
     <%
		if(buys!=null)
		{
			for(BuysBean b:buys){%>
    		<tr>
		    <td>id</td>
			    <td><%=++i %></td>
			    <td><%=b.getMaterialname() %></td>
			    <td><%=b.getNum() %></td>
			    <td></td>
			    <td><%=b.getZhuangtai() %></td>
			    <td><a href="updatebuys.do">确认入库</a></td>
		    </tr>             	
                
         <%}         
         } %>
 	
    
    </table>
    <a href="jump.do?val=1">添加入库</a>
  </body>
</html>
