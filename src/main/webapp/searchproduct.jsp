<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE HTML>
<html lang="en-US">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/css/productinfo.css" />
	<title>Search Product by id</title>
</head>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
 url="jdbc:mysql://localhost:3306/info"
 user="root" />

<sql:query dataSource="${db}" var="rs">
Select * from Product_Information WHERE id = ${product_id};
</sql:query>
<table border="2" width="100%">
<tr>
    <th>Product_Name</th>
    <th>Product_Description</th>
    <th>Product_Origin</th>
    <th>Used by</th>
    <th>Product_Buying_Price</th>
    <th>Product_Quantity</th>
    <th>Product_Quality</th>

</tr>
<c:forEach var="table" items="${rs.rows}">
<tr>
<td><c:out value="${table.Product_Name}"/></td>
<td><c:out value="${table.Product_Description}"/></td>
<td><c:out value="${table.Product_Origin}"/></td>
<td><c:out value="${table.Gender}"/></td>
<td><c:out value="${table.Product_Buying_Price}"/></td>
<td><c:out value="${table.Product_Quantity}"/></td>
<td><c:out value="${table.Product_Quality}"/></td>
</tr>
</c:forEach>
</table>

</body>
</html>