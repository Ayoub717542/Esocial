package service;

import DAO.EmployeurDAO;
import models.Employeur;
import java.sql.SQLException;
import java.util.List;

public class EmployeurServic {

    private EmployeurDAO dao = new EmployeurDAO();

    public List<Employeur> listerTous() throws SQLException {
        return dao.listerTous();
    }

    public void ajouterEmployeur(Employeur e) throws SQLException {
        dao.ajouter(e);
    }

    public Employeur trouverParId(Long id) throws SQLException {
        return dao.trouverParId(id);
    }
}