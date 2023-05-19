<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 19.05.2023
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tabulate result</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<jsp:useBean id="pb" type="com.example.web1905.beans.PointBean" scope="request"/>
<table>
    <thead>
    <tr>
        <th>X</th>
        <th>Y</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pb.points}" var="p">
        <tr>
            <td>${p.x}</td>
            <td>${p.y}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
