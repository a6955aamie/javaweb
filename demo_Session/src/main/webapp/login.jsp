<%--
  Created by IntelliJ IDEA.
  User: xiayue-jiaqi
  Date: 2024/9/29
  Time: 8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="reg" action="/demo_Session/LoginServlet"
      method="post">
    用户名: <input name="username" type="text"/><br/>
    密码：  <input name="password" type="password"/><br/>
    <input type="submit" value="提交" id="bt"/>
</form>
</body>

</html>
