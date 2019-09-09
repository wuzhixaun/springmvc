<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/5
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>111</title>


</head>
<body>
    <table>

    </table>

        <c:if test="${not empty requestScope.users}">
            <c:forEach items="users" var="user">
    <tr>
<%--                <td>${user.useraname}</td>--%>
<%--        <td>${user.age}</td>--%>
<%--        <td>${user.birth}</td>--%>
    </tr>
            </c:forEach>
        </c:if>

</body>
</html>
