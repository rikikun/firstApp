<html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<body>
	<h2>Hello World!</h2>
	<s:form action="empinfo" method="post">
		<s:textfield name="name" label="Name" size="20" />
		<s:textfield name="age" label="Age" size="20" />
		<s:submit name="submit" label="Submit" align="center" />
	</s:form>
</body>
</html>
