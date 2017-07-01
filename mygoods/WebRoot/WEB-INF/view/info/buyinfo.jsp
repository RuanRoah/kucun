<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList,com.bean.MaterialBean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <%
  int i=0;
    ArrayList<MaterialBean> material=null; 
		if(request.getAttribute("material")!=null){
			material = (ArrayList<MaterialBean>)request.getAttribute("material");
		}
	%>
  <body>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加用料 </title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  </head>
  
  <body>
    <form action="addbuy.do" method="post">
    	<label>选择材料</label><select>
    	
		
		
		<%
		if(material!=null)
		{
			for(MaterialBean m:material){%>
		
		
    		<option value="<%=m.getId()%>"><%=m.getMaterialname()%></option>
    		
    		<%}         
         } %>
    	</select>
    	<label>价格</label>
    	<input type="text" name="price">
    	<label>数量单位</label><input type="text" name="passwd">
    	<label>描述</label><textarea name="passwd"></textarea><br>
    	<button type="submit">提交</button>
    </form> <br>
  </body>
</html>