<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2018/8/6
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>练习页面重定向</title>
</head>
<body>
<h2>练习页面重定向</h2>
<p>点击下面的按钮将结果重定向到新页面final.jsp</p>
<form:form method="GET" action="redirect">
    <table>
        <tr>
            <td><input type="submit" value="页面重定向" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>
