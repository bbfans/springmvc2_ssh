<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		border: 1px solid black;
		border-collapse: collapse;
		margin: 0 auto;
	}
	td{
		text-align: center;
		border: 1px solid black;
		padding: 8px;
		min-width: 200px;
	}
	input[type=text]{
		width: 500px;
		height: 30px;
		font-size: 16px;
	}
</style>
</head>
<body>
	<h1 align="center">修改person信息的界面</h1>
	<form method="post" action="${pageContext.servletContext.contextPath}/person/updatePersonInf">
		<table>
			<tr>
				<td>id</td>
				<td>
					<input type="text" name="id" value="${requestScope.person.id}" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>name</td>
				<td>
					<input type="text" name="name" value="${requestScope.person.name}">
				</td>
			</tr>
			<tr>
				<td>address</td>
				<td><input type="text" name="address"
					value="${requestScope.person.address}"></td>
			</tr>
			<tr>
				<td>age</td>
				<td>
					<input type="text" name="age" value="${requestScope.person.age}">
				</td>
			</tr>
			<tr>
				<td>phone</td>
				<td>
					<input type="text" name="phone" value="${requestScope.person.phone}">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="保存修改">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>