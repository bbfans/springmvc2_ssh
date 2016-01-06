<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border: 1px solid black;
	border-collapse: collapse;
	margin: 0 auto;
}

td {
	border: 1px solid black;
	text-align: center;
	padding: 10px;
	min-width: 100px;
}
.add{
	width:	55%;
	margin: 0 auto;
	text-align: right;
	margin-bottom: 5px;
}
</style>
</head>
<body>
	<h1 align="center">用户管理界面</h1>
	<div>
		<div class="add">
			<a href="${pageContext.servletContext.contextPath}/person/addPersonUI">添加</a>
		</div>
		<table>
			<tr>
				<td>id</td>
				<td>name</td>
				<td>address</td>
				<td>age</td>
				<td>phone</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${requestScope.persons}" var="person">
				<tr>
					<td>${person.id}</td>
					<td>${person.name}</td>
					<td>${person.address}</td>
					<td>${person.age}</td>
					<td>${person.phone}</td>
					<td>
						<a href="${pageContext.servletContext.contextPath}/person/updateUI?id=${person.id}">修改</a> 
						&nbsp;
						<a href="${pageContext.servletContext.contextPath}/person/deletePerson?id=${person.id}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>