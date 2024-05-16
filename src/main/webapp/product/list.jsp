<%--
  Created by IntelliJ IDEA.
  User: M00g1234
  Date: 5/14/2024
  Time: 7:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List ${x}</h1>
${p.name}, ${p.score}, ${p.id}
<c:forEach items="${l}" var="it">
    <h1>${it.name}, ${it.score} </h1>
</c:forEach>
</body>
</html>