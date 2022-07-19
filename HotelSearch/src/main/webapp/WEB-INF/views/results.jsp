<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results!</title>
<link href="/style.css" rel="stylesheet">
</head>
<body>
<h1>Hotel Results for ${hotel.city}</h1>
<div>

<table class="table">
	<thead>
		<tr>
			<th>Name</th>
			<th>City</th>
			<th>Price Per Night</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="city" items="${hotels}">
			<tr>
				<td><a href="/hotels/detail?id=${city.id}">${city.name}</a></td>
				<td>${city.city}</td>
				<td>${city.pricePerNight}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<a class="button" href="/">Home!</button>
</div>
</body>
</html>