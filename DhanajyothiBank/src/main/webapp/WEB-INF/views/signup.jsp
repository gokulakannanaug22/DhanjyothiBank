
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DhanJyothi Bank</title>

<link href="<c:url value="/resources/css/menu.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/custom.css" />"
	rel="stylesheet">
</head>

<body>

	<div class="registerationMsg">

		<div class="row">
			<div class="col">
				<h4 align="center">
					<B>DhanJyothi Bank - Customer Registration</B>
					</h4>
			</div>
		</div>
		<br>
	</div>
	<br>
<br>
	
	<div class="iet-container">

		
		<c:url var="actionUrl" value="/save" />
		<div style="border: 1px solid #ccc;">
			<form:form action="${actionUrl}" modelAttribute="user" method="POST"
				acceptCharset="UTF-8">


				<br>

				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-1 control-lable" for="first_name">First
							Name</label>
						<div class="col-md-2">
							<form:input type="text" path="first_name" id="first_name"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="first_name" class="help-inline" />
							</div>
						</div>

						<label class="col-md-1 control-lable" for="last_name">Last
							Name</label>
						<div class="col-md-2">
							<form:input type="text" path="last_name" id="last_name"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="last_name" class="help-inline" />
							</div>
						</div>

						<label class="col-md-1 control-lable" for="dob">DOB</label>
						<div class="col-md-2">
							<form:input type="date" path="dob" id="dob"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="dob" class="help-inline" />
							</div>
						</div>

					</div>
				</div>



				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-1 control-lable" for="add_line1">Address
							Line1</label>
						<div class="col-md-2">
							<form:input type="text" path="add_line1" id="add_line1"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="add_line1" class="help-inline" />
							</div>
						</div>

						<label class="col-md-1 control-lable" for="add_line2">Address
							Line2</label>
						<div class="col-md-2">
							<form:input type="text" path="add_line2" id="add_line2"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="add_line2" class="help-inline" />
							</div>
						</div>


						<label class="col-md-1 control-lable" for="city">City</label>
						<div class="col-md-2">
							<form:input type="text" path="city" id="city"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="city" class="help-inline" />
							</div>
						</div>

					</div>
				</div>




				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-1 control-lable" for="state">State</label>
						<div class="col-md-2">
							<form:input type="text" path="state" id="state"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="state" class="help-inline" />
							</div>
						</div>


						<label class="col-md-1 control-lable" for="pin">Pin Code</label>
						<div class="col-md-2">
							<form:input type="text" path="pin" id="pin" maxlength="6"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="pin" class="help-inline" />
							</div>
						</div>

						<label class="col-md-1 control-lable" for="mobile_number">Mobile
							Number</label>
						<div class="col-md-2">
							<form:input type="text" path="mobile_number" id="mobile_number" 
								class="form-control input-sm"  maxlength="10" />
							<div class="has-error">
								<form:errors path="mobile_number" class="help-inline" />
							</div>
						</div>

					</div>
				</div>



				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-1 control-lable" for="email_id">Email</label>
						<div class="col-md-2">
							<form:input type="email" path="email_id" id="email_id"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="email_id" class="help-inline" />
							</div>
						</div>

						<label class="col-md-1 control-lable" for="email_id">AADHAR</label>
						<div class="col-md-2">
							<form:input type="text" path="aadhar_id" id="aadhar_id"
								class="form-control input-sm" maxlength="16" />
							<div class="has-error">
								<form:errors path="aadhar_id" class="help-inline" />
							</div>
						</div>

						<label class="col-md-1 control-lable" for="email_id">PAN</label>
						<div class="col-md-2">
							<form:input type="text" path="pan" id="pan" maxlength="10"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="pan" class="help-inline" />
							</div>
						</div>

					</div>
				</div>




				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-1 control-lable" for="userName">User
							Name</label>
						<div class="col-md-2">
							<form:input type="text" path="userName" id="userName"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="userName" class="help-inline" />
							</div>
						</div>

						<label class="col-md-1 control-lable" for="password">Password</label>
						<div class="col-md-2">
							<form:password path="password" id="password" maxlength="15"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="password" class="help-inline" />
							</div>
						</div>

						<label class="col-md-1 control-lable" for=confirmPassword>Confirm
							Password</label>
						<div class="col-md-2">
							<form:password path="confirmPassword" id="confirmPassword" maxlength="15"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="confirmPassword" class="help-inline" />
							</div>
						</div>


					</div>
				</div>


				<br>

				<div class="row">
					<div class="form-group col-md-12">
						<div align="center">
						<!-- <INPUT TYPE="reset" value="Reset"> -->
							&emsp;&emsp;&emsp;&emsp;
							<input type="submit" value="Register"
								class="btn btn-primary btn-sm">
								&emsp;&emsp;&emsp;&emsp;
								<a href="<%=request.getContextPath()%>/login"><input type="button" value="Login"
								class="btn btn-primary btn-sm"></a>
						</div>
						
					</div>
				</div>


			</form:form>
		</div>

		<br></br>
	</div>

<%@ include file="/WEB-INF/views/_footer.jsp"%>
</body>
</html>