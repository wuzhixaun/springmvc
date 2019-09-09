<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/5
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>111</title>


</head>
<body>
<h1>Hellow</h1>

<h1>${requestScope.username}</h1>
<h1>${date}</h1>

session user:<h1>${sessionScope.user}</h1>
session helloword:<h1>${sessionScope.helloword}</h1>
request user:<h1>${requestScope.user}</h1>
request helloword:<h1>${requestScope.helloword}</h1>
</body>
</html>
