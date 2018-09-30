<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2018/8/6
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>练习表单处理-密码,文本域textarea,复选框checkbox,多复选框</title>
</head>
<body>
<h2>用户信息</h2>
<form:form method="POST" action="addUser">
    <table>
        <tr>
            <td><form:label path="username">用户名儿：</form:label></td>
            <td><form:input path="username" /></td>
            <%--这个地方用的是username取的是哪儿的值啊,是User.java里面的？
            这个地方之前User.java里面取的名字是name，这个时候因为前后名称不一致所以
            好像会出错--%>
        </tr>
        <tr>
            <td><form:label path="password">密码：</form:label></td>
            <td><form:password path="password" /></td>
        </tr>
        <tr>
            <td><form:label path="address">地址:</form:label></td>
            <td><form:textarea path="address" rows="5" cols="30" /></td>
        </tr>
        <tr>
            <td><form:label path="receivePaper">订阅新闻了吗？</form:label></td>
            <td><form:checkbox path="receivePaper" /></td>
        </tr>
        <tr>
            <td><form:label path="favoriteStrings">哪一天真开心？</form:label></td>
            <td><form:checkboxes path="favoriteStrings" items="${weekList}"/></td>
        </tr>
        <tr>
            <td><form:label path="country">国籍：</form:label></td>
            <td><form:select path="country">
                <form:option value="NONE" lable="选一下吧。。。"/>
                <form:options items="${countryList}"/>
            </form:select></td>
        </tr>
        <tr>
            <td><form:label path="skills">sleep?</form:label></td>
            <td><form:select path="skills" items="${skillsList}" multiple="true"/> </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
