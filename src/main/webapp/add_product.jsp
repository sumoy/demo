<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
<h3>Welcome, Enter The Product Details</h3>
<form:form method="POST" action="/product/add" modelAttribute="product">
  <table>
    <tr>
      <td><form:label path="name">Name</form:label></td>
      <td><form:input path="name"/></td>
    </tr>
    <tr>
      <td><form:label path="description">Description</form:label></td>
      <td><form:input path="description"/></td>
    </tr>
    <tr>
      <td><input type="submit" value="Submit"/></td>
    </tr>
  </table>
</form:form>
</body>
</html>