<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
  <title>Danh sách đơn hàng</title>
</head>
<body>

<h2>Xin chào, <c:out value="${loggedUser}" />! Vai trò: <c:out value="${role}" /></h2>

<table border="1" cellpadding="5">
  <tr>
    <th>Mã đơn</th>
    <th>Sản phẩm</th>
    <th>Tổng tiền</th>
    <th>Ngày đặt</th>
  </tr>
  <c:forEach var="order" items="${orders}">
    <tr>
      <td><c:out value="${order.id}" /></td>
      <td><c:out value="${order.product}" /></td>
      <td><fmt:formatNumber value="${order.total}" type="currency" currencySymbol="₫" /></td>
      <td><fmt:formatDate value="${order.date}" pattern="dd/MM/yyyy" /></td>
    </tr>
  </c:forEach>
</table>

<p>Tổng lượt xem đơn hàng toàn hệ thống: <c:out value="${applicationScope.totalViewCount}" /></p>

<a href="<c:url value='/logout' />">Đăng xuất</a>

</body>
</html>