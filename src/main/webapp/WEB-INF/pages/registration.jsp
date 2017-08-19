<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>You nedd to be with us! Quick registration form:</title>

    <h3>Re: ${connect}</h3>

    <form:form method="POST"  action="/registration">
        <div class="container" align="left">
            <br>
            <label>Your name is:</label>
            <input type="text" name="name" required="required"/>
            <br><br>
            <label>Enter secret Password:</label>
            <input type="password" name="password" required="required"/>
            <br>
            <button type="submit">Register me!</button>
        </div>
    </form:form>

</head>
<body>

</body>
</html>
