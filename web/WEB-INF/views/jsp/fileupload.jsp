<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2018/8/7
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>练习文件上传</title>
</head>
<body>
modelAttribute="fileUpload"这是什么意思？？？
<%--<form:form method="POST" modelAttribute="fileUpload"
           enctype="multipart/form-data">--%>
    <form:form method="POST" action="fileuploadpage">
    选择文件上传:
    <input type="file" name="file"/>
    <input type="submit" value="上传"/>
</form:form>
</body>
</html>
