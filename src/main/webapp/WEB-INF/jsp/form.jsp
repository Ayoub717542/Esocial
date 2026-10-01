<form action="${pageContext.request.contextPath}/employeurs" method="post">

    <label>Raison Sociale :</label>
    <input type="text" name="raisonSociale" required />

    <label>Secteur d&apos;activité :</label>
    <input type="text" name="secteurActivite" />

    <button type="submit">Enregistrer</button>
</form>