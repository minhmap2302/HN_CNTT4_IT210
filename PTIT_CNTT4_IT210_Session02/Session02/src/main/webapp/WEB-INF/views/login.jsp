<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Đăng nhập hệ thống quản lý đơn hàng</title>
</head>
<body>

<h2>Đăng nhập</h2>


<c:if test="${not empty loginError}">
  <p style="color:red;"><c:out value="${loginError}" /></p>
</c:if>

<form action="<c:url value='/login' />" method="post">
  <label>Username:</label>
  <input type="text" name="username" required /><br/><br/>

  <label>Password:</label>
  <input type="password" name="password" required /><br/><br/>

  <button type="submit">Đăng nhập</button>
</form>

</body>
</html>