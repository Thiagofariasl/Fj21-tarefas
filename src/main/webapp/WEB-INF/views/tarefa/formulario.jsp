<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h3>Adicionar tarefas</h3>
<form:errors path="tarefa.descricao"/>
<form action="adicionaTarefa" method="post">
</form>
<form action="adicionaTarefa" method="post">
  Descrição: <br />
  <textarea name="descricao" rows="5" cols="100"></textarea><br />
  <input type="submit" value="Adicionar">
</form>
</body>
</html>