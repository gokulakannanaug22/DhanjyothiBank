<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Beneficiary Type Page</title>
<%@ include file="/WEB-INF/views/_menu.jsp"%>
</head>
<body>

	<div class="iet-container">
		<h4 align="left">
			<B style="color: #2196F3 !important">Select Beneficiary Type</B>
		</h4>

		<table class="iet-table-all">
			<tr>
				<td><B><label for="withInBank"><a	href="<%=request.getContextPath()%>/beneficiarywithinbank">
				Transfer With In Bank</a></label></B></td>
				<td><B><label for="OtherBank"><a
					href="#">Transfer to Other Bank</a></label></B></td>
			</tr>
		</table>
	</div>
</body>
<%@ include file="/WEB-INF/views/_footer.jsp"%>
</html>