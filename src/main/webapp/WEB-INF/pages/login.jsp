<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Connect to me...</title>

    <h3>${connect}</h3>

    <form:form method="POST" modelAttribute="SpringWeb">
        <div class="container" align="left">
            <label>Username</label>
            <input type="text" name="name" required="required"/>
            <br>
            <label>Password</label>
            <input type="password" name="password" required="required"/>
            <button type="submit">Login</button>
        </div>
    </form:form>

</head>
<body>

</body>
</html>
