<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*"    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Summary</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
        tr,td{
            padding: 40px;
        }
        img{
            border-radius: 100%;
        }
        *
        {
            color: #013528;
        }
    </style>
</head>

<body>
    <div class="card text-center">
        <div class="card-header">
            <h1 style=" display: inline-block;"> <img src="images/logo.jpg" alt="Image Not Found"> STOCK MARKET CHARTING</h1>
        </div>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="importStockPage.html">Import Data</a>
                <a class="navbar-brand" href="listCompanyPage.html">Manage Company</a>
                <a class="navbar-brand" href="stockDetailsPage.html">Manage Exchange</a>
                <a class="navbar-brand" href="#">Update IPO Details</a>
                <a class="navbar-brand" href="#">Logout</a>
            </div>
        </nav>

    </div>
    <h4 style="text-align: center;padding-top: 40px;">Summary of Upload</h4>
    <table align="center">
        <tr>
            <td>Company Name</td>
            <td>Abc LTD</td>
        </tr>
        <tr>
                <td>Stock Exchange</td>
                <td>BSE</td>
            </tr>
            <tr>
                    <td>No of Records Imported</td>
                    <td>80</td>
                </tr>
                <tr>
                        <td>From Date</td>
                        <td>To Date</td>
                    </tr>
    </table>
    <div style="text-align: center">
    <button type="button" class="btn btn-dark">OK</button></div>
    <footer class="card-header footer">

    </footer>
</body>

</html>