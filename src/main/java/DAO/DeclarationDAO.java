package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import utils.DBconnection;

import models.Employeur;

public class DeclarationDAO {


    public void insert(Employeur e) {
        String sql = "INSERT INTO employeur (raison_sociale, secteur_activite) VALUES (?, ?)";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, e.getRaisonSociale());
            ps.setString(2, e.getSecteurActivite());

            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

  
    public List<Employeur> findAll() {
        List<Employeur> list = new ArrayList<>();
        String sql = "SELECT * FROM employeur";

        try (Connection conn = DBconnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Employeur e = new Employeur();
                e.setId(rs.getInt("id"));     
                e.setRaisonSociale(rs.getString("raison_sociale"));
                e.setSecteurActivite(rs.getString("secteur_activite"));

                list.add(e);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return list;
    }

    
    public void delete(int id) {
        String sql = "DELETE FROM employeur WHERE id = ?";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
