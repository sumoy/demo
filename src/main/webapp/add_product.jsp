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
		<td><form:label path="origin">Origin District</form:label></td>
		<td><form:select path="origin">
			<option value="Rangamati">Rangamati</option>
			<option value="Bandarban">Bandarban</option>
			<option value="Khagrachori">Bandarban</option>
			</form:select>
		</td>
    </tr>
    <tr>
    	<td><form:label path="gender">Origin District</form:label></td>
    	<td><form:select path="gender">
   			<option value="male">Male</option>
   			<option value="female">Female</option>
   			<option value="both">Both</option>
   			</form:select>
    	</td>
    </tr>
	<tr>
		<td><form:label path="buyingprice">Buying Price</form:label></td>
		<td><form:input path="buyingprice"/></td>
    </tr>
	<tr>
		<td><form:label path="quantity">Quantity</form:label></td>
		<td><form:input path="quantity"/></td>
    </tr>
	    <tr>
		<td><form:label path="quality">Quality</form:label></td>
		<td><form:select path="quality">
			<option value="A Grade">A Category</option>
			<option value="B Grade">B Category</option>
			<option value="C Grade">C Category</option>
			</form:select>
		</td>
    </tr>
    <tr>
		<td><input type="submit" value="Submit"/></td>
    </tr>
  </table>
</form:form>
</body>
</html>