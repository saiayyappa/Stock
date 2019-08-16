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
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
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

#icon {
	margin-left: 1100px;
	font-size: 40px;
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
		<nav class="navbar navbar-expand-lg navbar-light bg-light"
			style="margin-bottom: 0px;">
			<div class="container">
				<a class="navbar-brand" href="importStockPage.html">Import Data</a>
				<a class="navbar-brand" href="listCompanyPage.html">Manage
					Company</a> <a class="navbar-brand" href="stockDetailsPage.html">Manage
					Exchange</a> <a class="navbar-brand" href="#">Update IPO Details</a> <a
					class="navbar-brand" href="#">Logout</a>
			</div>
		</nav>

	</div>
	<h4 style="text-align: center;">
		<strong>Comparison Chart</strong>
	</h4>
	<form:form modelAttribute="c" method="POST" action="">
		<table align="center">
			<tr>
				<td>Select Company/Sector</td>
				<td>
					<div class="form-group">

						<div class="col-sm-30">
							 <form:select path="sectorName" id="sectorName"
								class="form-control">
								<form:option value="select">Select Sector </form:option>
								<form:options items="${sector}" />
							</form:select>  
						</div>
					</div>
				</td>
			</tr>
			<tr>
				<td>Select Stock Exchange</td>
				<td>
					<div class="form-group">

						<div class="col-sm-40">
							<%-- <form:select path="remarks" id="stockExchange"
								class="form-control">
								<form:option value="select">Select StockExchange </form:option>
								<form:options items="${stock}" />
							</form:select> --%>

						</div>
					</div>
				</td>
			</tr>
			<tr>
				<td>Company Name</td>
				<td><input type="text" value="Abc" /></td>
			</tr>
			<tr>
				<td>From Date</td>
				<td>To Date</td>
			</tr>
			<tr>
				<td>Specify periodicity</td>
				<td></td>
			</tr>
		</table>

		<div id="icon">
			<a href="#"> <span class="glyphicon glyphicon-plus-sign"></span>
			</a>
		</div>
		<div style="text-align: center">
			<input type="submit" value="Generate Map" class="btn btn-dark">

		</div>
	</form:form>
	<footer class="card-header footer"> </footer>
</body>

</html>