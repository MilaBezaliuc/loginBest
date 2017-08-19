<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>List of users</h1>

<c:forEach items="${userList}" var="user">
    <p> ${user.name}
        <a href="/delete/${user.name}"> delete me!</a>
    </p>
</c:forEach>
</body>
</html>
