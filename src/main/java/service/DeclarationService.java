package service;

import DAO.DeclarationDAO;
import models.Employeur;
import java.util.List;

public class DeclarationService {

    private DeclarationDAO dao = new DeclarationDAO();
    public void insert(Employeur e) {
        dao.insert(e);
    }
    public List<Employeur> findAll() {
        return dao.findAll();
    }
    public void delete(int id) {
        dao.delete(id);
    }
}