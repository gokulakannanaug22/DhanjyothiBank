<%@ page language="java" import="com.dhanjyothi.model.User"%>
 <link href="<c:url value="/resources/css/menu.css" />" rel="stylesheet">
 <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
  <link href="<c:url value="/resources/css/custom.css" />" rel="stylesheet">

  
<div class="welcomemsg" >
Welcome&nbsp;<%=request.getSession().getAttribute("username").toString()%>&nbsp;!
<a href="<%=request.getContextPath()%>/logout" style="float: right; color: #fff;">Logout</a></li>
</div>
<div class="drop" >
<ul class="drop_menu">

<li> <a class="dropbtn" href="<%=request.getContextPath()%>/accsummary">Account</a>
	<ul>
	<li><a href="<%=request.getContextPath()%>/createsavingsaccount">Create Savings Account</a></li>
	
	</ul>
</li>
<li> <a class="dropbtn" href="#">Fund Transfer</a>
	<ul>
	<li><a href="<%=request.getContextPath()%>/loadbeneficiary">Add Beneficiary</a></li>
	<li><a href="<%=request.getContextPath()%>/loadtransfer">Fund Transfer</a></li>
	</ul>
</li>

<li> <a class="dropbtn" href="#">Service Request</a>
	<ul>
	<li><a href="#">Create Cheque Book Request</a></li>
	
	</ul>
</li>

<li>
<a href="#"></a>
	<ul>
	<li><a class="dropbtn" href="#"></a></li>
	</ul>
</li>

<li><a class="dropbtn" href="#"></a>
	<ul>

	</ul>
</li>

<li><a  href="#"></a>
	<ul>

	</ul>
</li>






</ul>


</div>






















