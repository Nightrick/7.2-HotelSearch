<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotelz.com</title>
<link href="/style.css" rel="stylesheet">
</head>
<body>
<h1>Hotel Search by Hotelz.com</h1>
<div>
<form class="form" method = "POST" action ="/results">
  <label for="city">Choose a city:</label>
  <select name="city" id="city">
  <option value="Woodhaven">Woodhaven</option>
  <option value="Brownstown">Brownstown</option>
  <option value="Rockwood">Rockwood</option>
  <option value="Chicago">Chicago</option>
  </select>
  <input type="submit" value="Go!">
</form>
</div>
</body>
</html>