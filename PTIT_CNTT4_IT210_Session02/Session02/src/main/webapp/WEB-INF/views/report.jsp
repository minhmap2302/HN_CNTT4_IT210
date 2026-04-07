<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 4/7/2026
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
       <ul>
         <c:forEach var="item" items="${items}">
           <li><c:out value="${item}"/></li>
         </c:forEach>
       </ul>
</body>
</html>
