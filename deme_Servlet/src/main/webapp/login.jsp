<%--
  Created by IntelliJ IDEA.
  User: xiayue-jiaqi
  Date: 2024/9/25
  Time: 0:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--把表单内容提交到工程下的LoginServlet-->
    <form action="/demo123/LoginServlet" method="post">
    用户名： <input type="text" name="username"/><br/>
    密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"/><br/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
