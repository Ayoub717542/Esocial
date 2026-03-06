package servlet;

import DAO.EmployeurDAO;
import models.Employeur;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/employeurs")
public class EmployeurServlet extends HttpServlet {

    private final EmployeurDAO dao = new EmployeurDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            List<Employeur> liste = dao.listerTous();
            req.setAttribute("employeurs", liste);
            req.getRequestDispatcher("/employeur/list.jsp").forward(req, res);

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        Employeur e = new Employeur();
        e.setRaisonSociale(req.getParameter("raisonSociale"));
        e.setSecteurActivite(req.getParameter("secteurActivite"));

        try {
            dao.ajouter(e);
            res.sendRedirect("employeurs");

        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }
}