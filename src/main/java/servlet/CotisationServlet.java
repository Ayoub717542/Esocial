package servlet;

import service.CotisationService;
import models.Cotisation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/cotisations")
public class CotisationServlet extends HttpServlet {

    private CotisationService service = new CotisationService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int employeId = Integer.parseInt(request.getParameter("employeId"));
        double salaire = Double.parseDouble(request.getParameter("salaire"));

        double tauxSalarial = 0.04;
        double tauxPatronal = 0.12; 
        double plafond = 1000;      

        Cotisation c = service.calculerCotisation(employeId, salaire, tauxSalarial, tauxPatronal, plafond);

        service.enregistrerCotisation(c);

        response.sendRedirect(request.getContextPath() + "/cotisations.jsp");
    }
}