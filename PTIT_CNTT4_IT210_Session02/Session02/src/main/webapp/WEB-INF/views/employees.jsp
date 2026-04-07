
<%@ include file="header.jsp" %>

<h2>Danh sách nhân viên</h2>
<table border="1">
  <tr>
    <th>#</th><th>Mã NV</th><th>Họ tên</th><th>Phòng ban</th><th>Lương</th><th>Ngày vào làm</th><th>Trạng thái</th><th>Chi tiết</th>
  </tr>
  <c:forEach var="emp" items="${employees}" varStatus="status">
    <tr>
      <td>${status.count}</td>
      <td><c:out value="${emp.code}"/></td>
      <td><c:out value="${emp.fullName}"/></td>
      <td><c:out value="${emp.department}"/></td>
      <td><fmt:formatNumber value="${emp.salary}" type="currency" currencySymbol="₫"/></td>
      <td><fmt:formatDate value="${emp.joinDate}" pattern="dd/MM/yyyy"/></td>
      <td>
        <c:choose>
          <c:when test="${emp.status == 'Đang làm'}"><span style="color:green">${emp.status}</span></c:when>
          <c:when test="${emp.status == 'Nghỉ phép'}"><span style="color:orange">${emp.status}</span></c:when>
          <c:otherwise><span style="color:blue">${emp.status}</span></c:otherwise>
        </c:choose>
      </td>
      <td><a href="<c:url value='/employees/${emp.code}'/>">Xem chi tiết</a></td>
    </tr>
  </c:forEach>
</table>
<p>Tổng lương phòng ban Kỹ thuật: <fmt:formatNumber value="${totalTechSalary}" type="currency" currencySymbol="₫"/></p>

<%@ include file="footer.jsp" %>