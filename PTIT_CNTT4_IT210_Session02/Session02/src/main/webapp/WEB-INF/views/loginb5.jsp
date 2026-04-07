
<%@ include file="header.jsp" %>

<h2>Đăng nhập</h2>
<form action="<c:url value='/login' />" method="post">
  Username: <input type="text" name="username"/><br/>
  Password: <input type="password" name="password"/><br/>
  <input type="submit" value="Login"/>
</form>

<c:if test="${not empty errorMessage}">
  <p style="color:red"><c:out value="${errorMessage}"/></p>
</c:if>

<%@ include file="footer.jsp" %>