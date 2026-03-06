package DAO;
import DAO.EmployeurDAO;
import models.Employeur;
import java.sql.*;
import java.util.*;
import utils.DBconnection;
public class EmployeurDAO {

    public void ajouter(Employeur e) throws SQLException {
        String sql = "INSERT INTO employeur(raison_sociale, secteur_activite) VALUES(?,?)";
        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, e.getRaisonSociale());
            ps.setString(2, e.getSecteurActivite());
            ps.executeUpdate();
        }
    }

    public List<Employeur> listerTous() throws SQLException {
        List<Employeur> liste = new ArrayList<>();
        String sql = "SELECT * FROM employeur";
        try (Connection con = DBconnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                liste.add(new Employeur(
                    rs.getInt("id"),
                    rs.getString("raison_sociale"),
                    rs.getString("secteur_activite")
                ));
            }
        }
        return liste;
    }

    public Employeur trouverParId(Long id) throws SQLException {
        String sql = "SELECT * FROM employeur WHERE id=?";
        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
                return new Employeur(
                    rs.getInt("id"),
                    rs.getString("raison_sociale"),
                    rs.getString("secteur_activite")
                );
        }
        return null;
    }
}