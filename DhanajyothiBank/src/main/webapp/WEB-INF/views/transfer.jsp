<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transfer Page</title>
<%@ include file="/WEB-INF/views/_menu.jsp"%>

</head>
<%
pageContext.setAttribute("beneficiaries", request.getAttribute("beneficiaries"));
%>
<c:set var="beneficiaries" value="${beneficiaries}"/>
<body>

	<div class="iet-container">

		<h4 align="left" >
			<B style="color: #2196F3 !important">Fund Transfer</B>
		</h4>

		
<div class="iet-table-all">

<br>
			<c:url var="actionUrl" value="/transferamt" />
			<form:form action="${actionUrl}" modelAttribute="transaction"
				acceptCharset="UTF-8">

				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-1 control-lable" for="credit_acct">Beneficiaries
							</label>
						<div class="col-md-2">
						<!--  <select name="damsBss" id="damsBss">
							<c:forEach items="${validateList}" var="category">
								<option value="${category.id}">
									${category.name}</option>
							</c:forEach>
					</select>
							<form:select path="credit_acct" items="${beneficiaries}" multiple="true" />
							</div>
								-->
							<select name="credit_acct" id="credit_acct" class="form-control input-sm">
							<c:forEach items="${beneficiaries}" var="category">
								<option value="${category.benAccNumber}">
									${category.benName}</option>
							</c:forEach>
					</select>
							
						</div>

						<label class="col-md-1 control-lable" for="trn_amt">Amount</label>
						<div class="col-md-2">
							<form:input type="text" path="trn_amt" id="trn_amt" required="required"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="trn_amt" class="help-inline" />
							</div>
						</div>

						<label class="col-md-2 control-lable" for="trn_desc">Remarks</label>
						<div class="col-md-2">
							<form:input type="text" path="trn_desc" id="trn_desc" required="required" maxlength="20"
								class="form-control input-sm" />
							<div class="has-error">
								<form:errors path="trn_desc" class="help-inline" />
							</div>
						</div>

					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-12">
						<div align="center">

							<input type="submit" value="Transfer" class="btn btn-primary btn-sm">

						</div>

					</div>
				</div>
			</form:form>
</div>

	
	</div>
</body>
<%@ include file="/WEB-INF/views/_footer.jsp"%>
</html>