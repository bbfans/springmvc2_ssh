<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		margin: 0 auto;
		border-collapse: collapse;
		border: 1px solid black;
	}
	td{
		padding: 5px;
		min-width: 200px;
		text-align: center;
		line-height: 25px;
		font-size: 16px;
		border: 1px solid black;
	}
	input[type=text]{
		width:300px;
	}
</style>
</head>
<body>
	<h1 align="center">注册页面</h1>
	<form action="${pageContext.servletContext.contextPath}/person/save" method="post">
		<table>
			<tr>
				<td>姓名</td>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>地址</td>
				<td>
					<input type="text" name="address">
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td>
					<input type="text" name="age">
				</td>
			</tr>
			<tr>
				<td>电话号码</td>
				<td>
					<input type="text" name="phone">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="提交">
				</td>
				<td>
					<input type="reset" value="重置">
				</td>
			</tr>
		</table>
		
	</form>
</body>
</html>