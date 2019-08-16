
<%@page import="com.example.stockspring.model.StockPrice"%>
<%@page import="com.example.stockspring.model.StockExchange"%>
<%@page import="com.example.stockspring.model.Company"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
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
.card-header {
	background: linear-gradient(to bottom, #27454d 35%, #56b8c7 100%);
}

h1 {
	font-size: 62px;
	background: -webkit-linear-gradient(#56b8c7, #013528);
	-webkit-background-clip: text;
	-webkit-text-fill-color: transparent;
}

footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	color: white;
	text-align: center;
	height: 50px;
}

tr, td {
	padding: 10px;
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
	<%
		List stockList = (List) request.getAttribute("stockPriceList");
		System.out.println(stockList);
	%>


	<table border="1" style="margin-top: 100px;" align="center">
		<tr style="background-color: #56b8c7">
			<td><strong>Company Name</strong></td>
			<td><strong>StockCode </strong></td>
			<td><strong>Current Price</strong></td>
			<td><strong> Date</strong></td>
			<td><strong>Time</strong></td>
			<td></td>
		</tr>

		<%
			for (int i = 0; i < stockList.size(); i++) {
				StockPrice stock = (StockPrice) stockList.get(i);
		%>
		<tr>
			<td><%=stock.getCompany().getCompanyName()%></td>

			<td><%=stock.getStockCode()%></td>
			<td><%=stock.getCurrentPrice()%></td>
			<td><%=stock.getDate()%>
			<td><%=stock.getTime()%> <%-- <td><%=stock.getCompany().get %> --%>
			<td><input type="submit" value="edit" class="btn btn-dark"></td>
		</tr>
		<%
			}
		%>

	</table>

	<footer class="card-header"> </footer>
</body>

</html>
