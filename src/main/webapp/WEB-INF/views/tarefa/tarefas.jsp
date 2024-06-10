<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tarefas</title>
</head>
<body>
<h1>
</h1>
<br/>
<h1>Tarefas da base</h1>
<c:forEach var="li" items="${tarefas}">
    <table>
        <tr>
            <td><c:out value="${li.id}"/></td>
            <td><c:out value="${li.descricao}"/></td>
            <td><c:out value="${li.finalizado}"/></td>
            <td><c:out value="${li.dataFinalizacao}"/></td>
        </tr>
    </table>
</c:forEach>
</body>
</html>