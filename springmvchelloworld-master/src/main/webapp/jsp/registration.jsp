<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
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

.error {
	color: red;
}

fieldset {
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
	width: 600px;
}

form#innerPara {
	padding: 20px;
}

legend {
	width: 200px;
	padding: 10px 20px;
}

img {
	border-radius: 100%;
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
	</div>
	<h1 align="center">Welcome!!!</h1>

	<div align="center">
		<fieldset class="border">
			<legend class='text-center'>Registration</legend>
			<form:form id="innerPara" method="POST" modelAttribute="user"
				action="/register">
				<%-- <div class="form-group row">
					<label class="col-sm-2 col-form-label">User Id</label>
					<div class="col-sm-10">
						<form:input type="text" class="form-control" name="id" path="id"
							placeholder="User Id" />
						<form:errors path="id" cssClass="error"></form:errors>
					</div>
				</div> --%>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">User Name</label>
					<div class="col-sm-10">
						<form:input type="text" class="form-control" name="userName"
							path="userName" placeholder="User Name" />
						<form:errors path="userName" cssClass="error"></form:errors>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Password</label>
					<div class="col-sm-10">
						<form:input type="password" class="form-control" name="password"
							path="password" placeholder="Password" />
						<form:errors path="password" cssClass="error"></form:errors>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">User Type</label>
					<div class="col-sm-10">
						<form:input type="text" class="form-control" name="userType"
							path="userType" placeholder="User Type" />
						<form:errors path="userType" cssClass="error"></form:errors>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Email</label>
					<div class="col-sm-10">
						<form:input type="text" class="form-control" name="email"
							path="email" placeholder="Email" />
						<form:errors path="email" cssClass="error"></form:errors>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Mobile Number</label>
					<div class="col-sm-10">
						<form:input type="text" class="form-control" name="mobileNumber"
							path="mobileNumber" placeholder="Mobile Number" />
						<form:errors path="mobileNumber" cssClass="error"></form:errors>
					</div>
				</div>

				<br />
				<input type="submit" value="Register"
					class="btn btn-outline-success">
				<br>
				<br>

			</form:form>

		</fieldset>

	</div>
	<footer class="card-header footer"> </footer>

</body>

</html>