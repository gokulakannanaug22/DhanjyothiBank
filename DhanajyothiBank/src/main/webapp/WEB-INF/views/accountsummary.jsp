<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.dhanjyothi.model.User,com.dhanjyothi.model.Account"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Summary</title>
<%@ include file="/WEB-INF/views/_menu.jsp"%>

</head>
<body>
	<div class="iet-container">

	

			<h4 align="left">
				<B style="color: #2196F3 !important">Account Summary</B>
			</h4>

			<div class="row">
				<div class="col">
					<h5 align="center">
						<B style="color: Red;">
							<%
								if (request.getParameter("message") != null) {
							%> <%=request.getParameter("message").toString()%>
							<%
								}
							%>
						</B>
					</h5>
				</div>
			</div>

			<table class="iet-table-all iet-hoverable">
				<%
					if (request.getAttribute("accountDetails") != null) {
						Account acc = (Account) request.getAttribute("accountDetails");
				%>
				<tr>
					<td colspan="5" align="left" class="welcomemsg"><B>Savings
							Account Details</B></td>
				</tr>
				<tr>
					<th><B>Account Number</B></th>
					<th><B>Account Type</B></th>
					<th><B>Account Balance</B></th>
					<th><B>Created Date</B></th>
					<th><B>Updated Date</B></th>

				</tr>

				<tr id="<%=acc.getAcct_id()%>">
					<td><%=acc.getAcct_id()%></td>
					<td>
						<%
							if (acc.getAcct_type().equalsIgnoreCase("S")) {
									out.println("Savings");
								}
						%>
					</td>
					<td><%=acc.getAcc_balance()%></td>
					<td><%=acc.getAccount_created_date()%></td>
					<td><%=acc.getAccount_updated_date()%></td>
				</tr>
				<%
					} else {
				%><tr>
					<td colspan="5">Create your Savings Account</td>
				</tr>
				<%
					}
				%>
			</table>

	

	</div>
	<%@ include file="/WEB-INF/views/_footer.jsp"%>
</html>