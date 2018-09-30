<%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2018/8/6
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>表单练习1,隐藏字段</title>
</head>
<body>
<h2>Student Information</h2>
<form:form method="POST" action="addStudent">
    <table>
        <tr>
            <td><form:label path="name">名字：</form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="age">年龄：</form:label></td>
            <td><form:input path="age" /></td>
        </tr>
       <%-- <tr>
            <td><form:label path="id">编号：</form:label></td>
            <td><form:input path="id" /></td>
        </tr>--%>
        <tr>
            <td></td>
            <td><form:hidden path="id" value="1000"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交表单"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
