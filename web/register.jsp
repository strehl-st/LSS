<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
<form action="register" method="post">
	<table>
		<tr>
			<td>请输入用户名：</td>
			<td><input id="username" name="loginUser.username" type="text"></td>
		</tr>
		<tr>
			<td>请输入密码：</td>
			<td><input id="password" name="loginUser.password" type="password"></td>
			<td><input type="submit" value="提交注册"></td>
		</tr>
	</table>
</form>
</body>
</html>