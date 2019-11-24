<%-- 
    Document   : formulario
    Created on : Nov 23, 2019, 11:34:37 PM
    Author     : DEV
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <select name="cboDemo">
            <c:forEach var="x" items="${lista}">
                <option value="${x.iddemo}">${x.nombre}</option>
            </c:forEach>
        </select>
    </body>
</html>
