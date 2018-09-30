<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2018/8/6
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>静态页面练习</title>
</head>
<body>
<h2>静态页面练习</h2>
<p>点击下面的按钮获得一个简单的HTML页面</p>
<form:form method="get" action="staticPage">
    <%--要让form:form生效，要引入这一条<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
    <table>
        <tr>
            <td>
                <input type="submit" value="获取HTML页面"/>
            </td>
        </tr>
    </table>

</form:form>

</body>
</html>
