<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html><head>
  <title>Employeurs</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head><body>

<h1>Liste des Employeurs</h1>

<a href="views/form.jsp">+ Ajouter</a>

<table>
  <tr><th>ID</th><th>Raison Sociale</th><th>Secteur</th></tr>
 <c:forEach var="emp" items="${employeurs}">
    <tr>
        <td>${emp.id}</td>
        <td>${emp.raisonSociale}</td>
        <td>${emp.secteurActivite}</td>
    </tr>
</c:forEach>
</table>

</body></html>