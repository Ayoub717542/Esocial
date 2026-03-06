package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import utils.DBconnection;
import models.Assure;

public class AssureDAO {

    public void insert(Assure a) {
        String sql = "INSERT INTO assure (nom, salaire_mensuel, employeur_id) VALUES (?, ?, ?)";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, a.getNom());
            ps.setDouble(2, a.getSalaireMensue());
            ps.setInt(3, a.getId());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SELECT BY EMPLOYEUR
    public List<Assure> findByEmployeur(int employeurId) {

        List<Assure> list = new ArrayList<>();
        String sql = "SELECT * FROM assure WHERE employeur_id = ?";

        try (Connection conn = DBconnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, employeurId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Assure a = new Assure();
                a.setId(rs.getInt("id"));
                a.setNom(rs.getString("nom"));
                a.setSalaireMensue(rs.getDouble("salaire_mensuel"));
                a.setId(rs.getInt("employeur_id"));

                list.add(a);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
