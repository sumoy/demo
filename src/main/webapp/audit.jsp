<!DOCTYPE HTML>
<html lang="en-US">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/css/productinfo.css" />
	<title></title>
</head>
<body>
    <h3>How many faulty product we receive<h3>
    <form:form method="POST" action="/product/finalproductinformation" modelAttribute="faultyProduct">
          <form:input path="faultynumber"/>
          <input type="submit" value="Submit"/></td>
     </form:form>
</body>
</html>