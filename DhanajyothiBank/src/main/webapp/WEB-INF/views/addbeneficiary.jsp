<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddBeneficiary Page</title>
<%@ include file="/WEB-INF/views/_menu.jsp"%>

</head>
<body>

	<div class="iet-container" style="border: thin;">

		<h4 align="left">
			<B style="color: #2196F3 !important">Add Beneficiary</B>
		</h4>

		<div class="iet-table-all">

			<br>

			<c:url var="actionUrl" value="/savebeneficiary" />
			<form:form action="${actionUrl}" modelAttribute="beneficiary"
				acceptCharset="UTF-8">

				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-1 control-lable" for="benNickName">Beneficiary
							Nick Name</label>
						<div class="col-md-2">
							<form:input type="text" path="benNickName" id="benNickName"
								required="required" class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="benNickName" class="help-inline" />
							</div>
						</div>

						<label class="col-md-1 control-lable" for="benName">Beneficiary
							Name</label>
						<div class="col-md-2">
							<form:input type="text" path="benName" id="benName"
								required="required" class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="benName" class="help-inline" />
							</div>
						</div>

						<label class="col-md-2 control-lable" for="benAccNumber">Beneficiary
							Account Number</label>
						<div class="col-md-2">
							<form:input type="text" path="benAccNumber" id="benAccNumber"
								required="required" class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="benAccNumber" class="help-inline" />
							</div>
						</div>

					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-12">
						<div align="center">

							<input type="submit" value="ADD" class="btn btn-primary btn-sm">

						</div>

					</div>
				</div>
			</form:form>

		</div>

	</div>
</body>
<%@ include file="/WEB-INF/views/_footer.jsp"%>
</html>