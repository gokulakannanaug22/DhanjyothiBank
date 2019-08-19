
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="<c:url value="/resources/css/menu.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/custom.css" />"
	rel="stylesheet">
<title>Login</title>
<style>
.mylogintable {
	position: absolute;
	top: 32%;
	left: 590px;
}

/* Style the header */
.loginHeader {
	padding: 2px;
	text-align: center;
	font-size: 20px;
	color: #4472c4;
}
</style>
</head>

<body>
	<div class="iet-container">
	<br><br>
		<div class="row">
			<div class="col">
				<h3 align="center">
					<B style="color: blue;">DhanJyothi Internet App</B>
				</h3>
			</div>
		</div>
		
		<div class="row">
			<div class="col">
				<h5 align="center">
					<B style="color: Red;"><%if(request.getAttribute("message")!=null){%><%=request.getAttribute("message").toString()%><%}%></B>
				</h5>
			</div>
		</div>
		<div class="mylogintable">
			<c:url var="loginUrl" value="/submit" />
			<div style="border: 1px solid #ccc;">
			<form:form action="${loginUrl}" modelAttribute="user" method="POST"
				acceptCharset="UTF-8">


				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-3 control-lable" for="UserName">UserName
						</label>
						<div class="col-9">
							<form:input type="text" path="userName" id="userName"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="userName" class="help-inline" />
							</div>
						</div>
					</div>
				</div>


				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-3 control-lable" for="password">Password</label>
						<div class="col-9">
							<form:password path="password" id="password" maxlength="15"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="password" class="help-inline" />
							</div>
						</div>

					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-12">
						<div class="col-9" align="center">
							Don't have an account ?<a
								href="<%=request.getContextPath()%>/signup"> Sign Up</a>
							</li>
						</div>

					</div>
				</div>


				<div class="row">
					<div class="form-group col-md-12">
						<div class="form-actions col-9" align="center">
							<input type="submit" class="btn btn-primary btn-sm" value="Login">
						</div>

					</div>
				</div>
			</form:form></div>
		</div>

	</div>
</body>
</html>