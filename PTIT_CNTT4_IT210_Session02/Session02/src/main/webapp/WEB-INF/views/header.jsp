
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Mini HR Portal</title>
  <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">
</head>
<body>
<div style="background-color:#f0f0f0;padding:10px;">
  <span>Xin chào, <c:out value="${sessionScope.loggedUser}"/></span> |
  <a href="<c:url value='/logout'/>">Đăng xuất</a>
  <hr/>
  <nav>
    <a href="<c:url value='/employees'/>">Danh sách nhân viên</a>
    <c:if test="${sessionScope.role == 'hr_manager'}">
      | <a href="<c:url value='/employees/new'/>">Thêm nhân viên</a>
    </c:if>
  </nav>
</div>
<hr/>