<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<h2>Hello World!</h2>

<form action="/LoginController" method="post">
    用户名 loginId :  <input type="text" name="loginId"/><br>
    <br>
    密码 loginPwd  : <input type="password" name="loginPwd"/><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
