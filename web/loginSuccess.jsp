<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录成功</title>
</head>
<body>
<form action="orderSubmit" method="post">
<table>
    <tr>
        <td>buyer：</td>
        <td><input id="buyer" name="order.buyer" type="text"></td>
    </tr>
    <tr>
        <td><input type="submit" value="提交"></td>
    </tr>

</table>
</form>
</body>
</html>