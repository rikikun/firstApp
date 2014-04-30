<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<table border="1">
		<th>Transaction id</th>
		<th>Item name</th>
		<th>User name</th>
		<th>Amount</th>
		<th>Sum</th>


		<s:iterator value="listTransaction" status="stat">
			<tr>
				<%-- 				<td><s:checkbox name="%{selection}" --%>
				<%-- 						value="selection[%{#stat.index}]" /></td> --%>
				<td align="center"><s:property
						value="listTransaction[#stat.index].transactionId" /></td>
				<td align="center"><s:property
						value="listTransaction[#stat.index].stock.itemName" /></td>
				<td align="center"><s:property
						value="listTransaction[#stat.index].user.userName" /></td>
				<td align="center"><s:property
						value="listTransaction[#stat.index].amount" /></td>
				<td align="center"><s:property
						value="listTransaction[#stat.index].sum" /></td>
				<%-- 				<td><s:property value="listTransaction[%{#stat.index}].facilityID" /></td> --%>
				<%-- 				<td><s:property value="listTransaction[%{#stat.index}].description" /></td> --%>
			</tr>
		</s:iterator>
	</table>
</body>
</html>