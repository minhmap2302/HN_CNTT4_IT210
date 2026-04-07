<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ứng dụng quản lý nhân viên</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
            text-align: center;
        }

        h1 {
            color: #333;
        }

        .container {
            margin-top: 30px;
        }

        a {
            display: inline-block;
            padding: 10px 20px;
            margin: 10px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        a:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<h1>Chào mừng đến ứng dụng quản lý nhân viên</h1>
<div class="container">
    <a href="<%= request.getContextPath() %>/employees">Xem danh sách nhân viên</a>
</div>
</body>
</html>