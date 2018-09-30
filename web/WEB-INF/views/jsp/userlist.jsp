<%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2018/8/6
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=utf-8"    pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>练习表单处理-密码</title>
</head>
<body>
<h2>提交的用户信息</h2>
<table>
    <tr>
        <td>用户名：</td>
        <td>${username}</td>
    </tr>
    <tr>
        <td>密码：</td>
        <td>${password}</td>
    </tr>
    <tr>
        <td>地址：</td>
        <td>${address}</td>
    </tr>
    <tr>
        <td>是否订阅了Paper?</td>
        <td>${receivePaper}</td>
    </tr>
    <tr>
        <td>明天星期几</td>
        <%--这句话是个什么鬼?????--%>
        <td>
            ${favoriteStrings}
        </td>
    </tr>
    <tr>
        <td>国家：</td>
        <td>${country}</td>
    </tr>
    <tr>
        <td>skill:</td>
        <td>${skillsList}</td>
        <td>${skills}</td>
    </tr>
</table>
</body>
</html>
