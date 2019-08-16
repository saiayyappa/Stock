<%-- <%@page import="com.example.stockspring.model.Company"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
List companyList=(List)request.getAttribute("companyList");
System.out.println(companyList);
%>


<table>
<tr>
<td>id<td>
<td>Board of Directory</td>
</tr>

<% for(int i=0;i<companyList.size();i++){
	Company e=(Company)companyList.get(i);
	%>
<tr>
<td><%= e.getCompanyId() %><td>
<td><%= e.getBoardOfDirectors() %></td>
</tr>
<% }%>

</table>


</table>

</body>
</html> --%>



<%@page import="com.example.stockspring.model.Company"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*"    pageEncoding="UTF-8"%>
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
		List companyList = (List) request.getAttribute("companyList");
		System.out.println(companyList);
	%>


	<table  border="1" style="
    margin-top: 100px;
" align="center">
		<tr style="background-color:#56b8c7 ">
			<td><strong>Company Code</strong></td>
			<td><strong>Company Name</strong></td>
			<td><strong>turnOver</strong></td>
			<td><strong>CEO</strong></td>
			<td><strong>Board of Directory</strong></td>
			<td><strong>Sector Id</strong></td>
			<td><strong>Breif Writeup</strong></td>
			<td></td>
		</tr>

		<%
			for (int i = 0; i < companyList.size(); i++) {
				Company e = (Company) companyList.get(i);
		%>
		<tr>
			<td><%=e.getCompanyCode()%></td>

			<td><%=e.getCompanyName()%></td>
			<td><%=e.getTurnOver()%></td>
			<td><%=e.getCeo()%>
			<td><%=e.getBoardofDirectors()%>
			<td><%=e.getSectorid()%>
			<td><%=e.getBrief()%>
			<td><input type="submit" value="edit" class="btn btn-dark"></td>
		</tr>
		<%
			}
		%>

	</table>

	<footer class="card-header"> </footer>
</body>

</html>
