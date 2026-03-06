package service;

import DAO.CotisationDAO;
import models.Cotisation;

public class CotisationService {

    private CotisationDAO dao = new CotisationDAO();

    public Cotisation calculerCotisation(int employeId, double salaire, double tauxSalarial, double tauxPatronal, double plafond) {

        Cotisation c = new Cotisation();
        c.setEmployeId(employeId);
        c.setSalaire(salaire);

        double cotSalariale = salaire * tauxSalarial;
        double cotPatronale = salaire * tauxPatronal;
        
        if (cotSalariale > plafond) cotSalariale = plafond;
        if (cotPatronale > plafond) cotPatronale = plafond;

        c.setCotisationSalariale(cotSalariale);
        c.setCotisationPatronale(cotPatronale);

        return c;
    }

    public void enregistrerCotisation(Cotisation c) {
        dao.insert(c);
    }
}