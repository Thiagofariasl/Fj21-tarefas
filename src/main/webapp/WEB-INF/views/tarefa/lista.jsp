<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<a href="novaTarefa">Listar nova tarefa</a>
<br /> <br />
<table>
    <tr>
        <th>Id</th>
        <th>Descrição</th>
        <th>Finalizado?</th>
        <th>Data de finalização</th>
    </tr>
    <c:forEach items="${tarefas}" var="tarefa">
        <tr>
            <td>${tarefa.id}</td>
            <td>${tarefa.descricao}</td>
            <c:if test="${tarefa.finalizado eq false}">
                <td>Não finalizado</td>
            </c:if>
            <c:if test="${tarefa.finalizado eq true}">
                <td>Finalizado</td>
            </c:if>
            <td>
                    ${tarefa.dataFinalizacao}
            </td>
            <td><a href="removeTarefa?id=${tarefa.id}">Remover</a></td>
            <td><a href="mostraTarefa?id=${tarefa.id}">Alterar</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>