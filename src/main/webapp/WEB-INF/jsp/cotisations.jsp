<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calcul Cotisations</title>
</head>
<body>
    <h2>Calcul des Cotisations Sociales</h2>

    <!-- Simple form to submit employee ID and salary -->
    <form action="cotisations" method="post">
        <label>Employé ID:</label>
        <input type="number" name="employeId" required><br><br>

        <label>Salaire:</label>
        <input type="number" step="0.01" name="salaire" required><br><br>

        <input type="submit" value="Calculer et Enregistrer">
    </form>

    <hr>

    <h3>Instructions:</h3>
    <p>Entrez l'ID de l'employé et son salaire. Le système calculera automatiquement la cotisation salariale et patronale, puis l'enregistrera en base.</p>
</body>
</html>