<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/9
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="user" method="post">

    useraname:<input type="text" name="useraname">
    age：<input type="text" name="age">
    birth：<input type="text" name="birth">

    <input type="submit" value="submit">
</form>


<form action="uploadFile" method="post" enctype="multipart/form-data">


  file: <input type="file" name="file">

    <input type="submit" value="文件上传">
</form>
</body>
</html>
