<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<style>
.error {
	color: red;
}

.card-header {
	background: linear-gradient(to bottom, #27454d 35%, #56b8c7 100%);
}

h1 {
	font-size: 62px;
	background: -webkit-linear-gradient(#56b8c7, #013528);
	-webkit-background-clip: text;
	-webkit-text-fill-color: transparent;
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	color: white;
	text-align: center;
	height: 50px;
}

tr, td {
	padding: 20px;
}

img {
	border-radius: 100%;
}

* {
	color: #013528;
}
</style>
</head>

<body>
	<div class="card text-center">
		<div class="card-header">
			<h1 style="display: inline-block;">
				<img src="images/logo.jpg" alt="Image Not Found"> STOCK MARKET
				CHARTING
			</h1>
		</div>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container">
				<a class="navbar-brand" href="importStockPage.html">Import Data</a>
				<a class="navbar-brand" href="listCompanyPage.html">Manage
					Company</a> <a class="navbar-brand" href="stockDetailsPage.html">Manage
					Exchange</a> <a class="navbar-brand" href="#">Update IPO Details</a> <a
					class="navbar-brand" href="#">Logout</a>
			</div>
		</nav>

	</div>
	<h4 style="text-align: center; padding-top: 40px;">Create New
		Company</h4>
	<form:form method="POST" action="/ipoInsert" modelAttribute="ipo">
		<table align="center">
			<%-- <tr>
				<td>IPO ID</td>
				<td><form:input type="text" path="id" /> <form:errors
						path="id" cssClass="error"></form:errors></td>
			</tr> --%>
			<tr>
				<td>Company Code</td>
				<td><form:input type="text" path="companyCode" /> <form:errors
						path="companyCode" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Stock Exchange</td>
				<td><form:input type="text" path="stockExchange" /> <form:errors
						path="stockExchange" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Price Per Share</td>
				<td><form:input type="text" path="priceperShare" /> <form:errors
						path="priceperShare" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Total Shares</td>
				<td><form:input type="text" path="totalShares" /> <form:errors
						path="totalShares" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Open Date Time</td>
				<td><form:input type="text" path="openDateTime" /> <form:errors
						path="openDateTime" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Remarks</td>
				<td><form:input type="text" path="remarks" /> <form:errors
						path="remarks" cssClass="error"></form:errors></td>
			</tr>

		</table>

		<div style="text-align: center">
			<input type="submit" value="Save" class="btn btn-dark">
		</div>
	</form:form>
	<footer class="card-header footer"> </footer>
</body>

</html>