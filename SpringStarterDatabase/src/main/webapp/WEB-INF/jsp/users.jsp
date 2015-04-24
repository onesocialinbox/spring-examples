<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<body>
    <h1>List</h1>
    <ul>
   <c:forEach items="${users}" var="user">
        <li>
            <c:out value="${user}" />
        </li>
    </c:forEach>
    </ul>

</body>
</html>