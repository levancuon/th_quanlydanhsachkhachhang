
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<table border="1">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>email</td>
        <td>address</td>
        <td></td>
    </tr>
    <c:forEach var="customer" items="${customer}">
        <tr>
            <input type="hidden" value="${customer.id}" name="id">
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.email}</td>
            <td>${customer.address}</td>
            <td><a href="/admin/update?id=${customer.id}" > update </a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
