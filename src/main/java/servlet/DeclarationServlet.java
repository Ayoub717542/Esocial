package servlet;

import service.DeclarationService;
import models.Employeur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/declarations")
public class DeclarationServlet extends HttpServlet {


    private DeclarationService service = new DeclarationService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String employerId = request.getParameter("id");
        if (employerId != null) {
            int id = Integer.parseInt(employerId);
            service.delete(id);
        }
        List<Employeur> list = service.findAll();

        request.setAttribute("employeurs", list);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Employeur e = new Employeur();

        e.setRaisonSociale(request.getParameter("raisonSociale"));
        e.setSecteurActivite(request.getParameter("secteurActivite"));

        service.insert(e);

        response.sendRedirect("declarations");
    }
}