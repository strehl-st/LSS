<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单按钮</title>
</head>
<body>
<form action="allOrders" method="post">
<table>
		<!-- <tr>
			<td>请输入用户名：</td>
			<td><input id="username" name="loginUser.username" type="text"></td>
		</tr>
		<tr>
			<td>请输入密码：</td>
			<td><input id="password" name="loginUser.password" type="password"></td>
		</tr> -->
    <tr>
        <td><input type="submit" value="查询"></td>
    </tr>
</table>
<table border=1>
			<tr>
				<th>订单号</th>
				<th>商品号</th>
				<th>供应商号</th>
				<th>销售商号</th>
				<th>订单数量</th>
				<th>订单价格</th>
				<th>买家信息</th>
			</tr>
			<s:iterator value="orders" >
			<tr>
				<td>
					<s:property value="order_id" />
				</td>
				<td>
					<s:property value="commodity_id" />
				</td>
				<td>
					<s:property value="supplier_id" />
				</td>
				<td>
					<s:property value="retailer_id" />
				</td>
				<td>
					<s:property value="order_number" />
				</td>
				<td>
					<s:property value="order_price" />
				</td>
				<td>
					<s:property value="buyer" />
				</td>
			</tr>
		</s:iterator>
	</table>
</form>
</body>
</html>