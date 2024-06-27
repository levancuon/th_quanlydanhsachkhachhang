<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/admin/update" method="post">
    id : <input type="text" value="${customer.id}" name="id"> <br>
    Name : <input type="text" value="${customer.name}" name="name"> <br>
    email : <input type="text" value="${customer.email}" name="email"> <br>
    address : <input type="text" value="${customer.address}" name="address"> <br>
    <button type="submit">update</button>
</form>
</body>
</html>
