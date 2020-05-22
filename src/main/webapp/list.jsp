<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>43
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" re1="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<td>ID</td>
			<td>英雄</td>
			<td>阵营</td>
			<td>价格（钻石）</td>
			<td>上线时间</td>
			<td>操作</td>
			
		
		</tr>
		
		
		<c:forEach items="${page.list }" var="s">
			
			<tr>
				<td>${s.id }</td>
				<td>${s.name }</td>
				<td>${s.cname }</td>
				<td>${s.price}</td>
				<td>${s.status }</td>
				<td>${h.uptime }</td>
				<td>${ }</td>
		
			</tr>
		</c:forEach>
	</table>
</body>
</html>