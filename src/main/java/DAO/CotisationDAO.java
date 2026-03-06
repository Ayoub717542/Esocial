package DAO;

import models.Cotisation;
import java.sql.*;
import utils.DBconnection;

public class CotisationDAO {
    public void insert(Cotisation c) {
        String sql = "INSERT INTO cotisation (employe_id, salaire, cotisation_salariale, cotisation_patronale) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBconnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, c.getEmployeId());
            ps.setDouble(2, c.getSalaire());
            ps.setDouble(3, c.getCotisationSalariale());
            ps.setDouble(4, c.getCotisationPatronale());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}