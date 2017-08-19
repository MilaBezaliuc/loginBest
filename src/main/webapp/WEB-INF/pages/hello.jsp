<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

	<h1>Hello, ${user.name}!</h1>
	<h3>You password is: ${user.password}</h3>
	<br>

	<a href="/showUsers">Show me all users!</a>

</body>
</html>