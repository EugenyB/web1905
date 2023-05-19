<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 19.05.2023
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Artists</title>
    <link rel="stylesheet" href="styles.css" type="text/css">
</head>
<body>
<jsp:useBean id="ab" type="com.example.web1905.beans.ArtistBean" scope="request"/>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>Artist</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ab.artists}" var="a">
        <tr>
            <td>${a.id}</td>
            <td>${a.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
