<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*"    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>User</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        .card-header {
            background: linear-gradient(to bottom, #27454d 35%, #56b8c7 100%);


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

        h1 {
            font-size: 62px;
            background: -webkit-linear-gradient(#56b8c7, #013528);
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;

        }

        img {
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
                <a class="navbar-brand" href="importStockPage.html">IPO</a>
                <a class="navbar-brand" href="listCompanyPage.html">Compare Company</a>
                <a class="navbar-brand" href="stockDetailsPage.html">Compare Sections</a>
                <a class="navbar-brand" href="#">Others</a>
                <a class="navbar-brand" href="#">Logout</a>
            </div>
        </nav>

    </div>
    <footer class="card-header footer">

    </footer>
</body>

</html>