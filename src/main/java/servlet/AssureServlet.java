package servlet;

import service.AssureService;
import models.Assure;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/assure")
public class AssureServlet extends HttpServlet {

    private AssureService service = new AssureService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("WEB-INF/form.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nom = request.getParameter("nom");
        double salaire = Double.parseDouble(request.getParameter("salaire"));
        int employeurId = Integer.parseInt(request.getParameter("employeurId"));

        Assure a = new Assure();
        a.setNom(nom);
        a.setSalaireMensue(salaire);
        a.setEmployeurid(employeurId);

        service.insert(a);

        response.getWriter().println("Inserted successfully");
    }
}