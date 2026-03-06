package service;

import DAO.AssureDAO;
import models.Assure;
import java.util.List;

public class AssureService {

    private AssureDAO dao = new AssureDAO();

    public void insert(Assure a) {
        dao.insert(a);
    }

    public List<Assure> findByEmployeur(int employeurId) {
        return dao.findByEmployeur(employeurId);
    }
}