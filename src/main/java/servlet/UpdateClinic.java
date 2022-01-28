package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import beans.Clinic;

/**
 * Servlet implementation class UpdateClinic
 */
public class UpdateClinic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShowClinicList hotldb = null;

	public UpdateClinic() {
		super();
		hotldb = new ShowClinicList();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.print(request.getParameter("id") + "sdlmfjslmj");
		int id_clinic = Integer.parseInt(request.getParameter("id"));
		System.out.println(id_clinic);
		int id_prs = Integer.parseInt(request.getParameter("id_prs"));
		String nom = request.getParameter("nom");
		System.out.println(nom);
		String ville = request.getParameter("ville");
		System.out.println(ville);
		String description = request.getParameter("desc");
		System.out.println(description);
		String tel = request.getParameter("phone");
		String etoiles = request.getParameter("stars");
		String adresse = request.getParameter("adresse");
		String img = request.getParameter("photo");
		Clinic clinic = new Clinic(id_clinic, nom, adresse, ville, tel, description, etoiles, img, id_prs);
		hotldb.updateClinic(clinic);
		RequestDispatcher requestdis = request.getRequestDispatcher("/ClinicManager");
		requestdis.forward(request, response);
	}

}
