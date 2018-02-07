<!DOCTYPE HTML>
<html lang="en-US">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/css/productinfo.css" />
	<title></title>
</head>
<body>
	<table border=1px solid> 
		<th>"Product information"</th>
		<tr>
			<td>Name</td>
			<td>Description</td>
			<td>Origin</td>
			<td>Gender</td>
			<td>Buying price</td>
			<td>Quantity</td>
			<td>Quality</td>

		</tr>
		<tr>
			<td>${product.name}</td>
			<td>${product.description}</td>
			<td>${product.origin}</td>
			<td>${product.gender}</td>
			<td>${product.buyingprice}</td>
			<td>${product.quantity}</td>
			<td>${product.quality}</td>
		</tr>
	</table>
	<form method="POST" action="/product/search" >
    <table>
         <tr>
		    <td><label for="id">Product id : </label></td>
		    <td><input id="id" name = "id"/></td>
         </tr>
         <tr>
       		<td><input type="submit" value="search"/></td>
         </tr>
    </table>
    </form><br/>
    <h3>TO View all Product item Click Button Below </h3>
    <a href="/product/allproduct"><input type="submit" value= "View All product"/></a>
</body>
</html>