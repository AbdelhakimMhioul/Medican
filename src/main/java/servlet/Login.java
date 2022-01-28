package servlet;

import java.io.IOException;

import beans.Clinic;
import beans.Personne;
import db.PersonneDB;
import db.ShowClinicList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShowClinicList clinicman = null;

	public Login() {
		super();
		clinicman = new ShowClinicList();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect(request.getServletContext().getContextPath() + "/login.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PersonneDB prsdb = new PersonneDB();
		HttpSession session = request.getSession(true);
		Personne prs = new Personne();
		String n = request.getParameter("email");
		session.setAttribute("email", n);
		String p = request.getParameter("password");
		session.setAttribute("password", p);
		prs = prsdb.find(n, p);
		session.setAttribute("id_manager", prs.getId_prs());
		String status = prsdb.validate(n, p);
		session.setAttribute("status", status);
		System.out.println(status);
		System.out.println("sjdmppppppp");
		try {
			if (status.equals("Client")) {
				System.out.println("namigonamgio");
				session.setAttribute("nameUser", prs.getPrenom_prs() + " " + prs.getNom_prs());
				request.getRequestDispatcher("/ShowClinics").forward(request, response);
			} else if (status.equals("Manager")) {
				System.out.print("Insideeeee");
				session.setAttribute("currentSessionUser", prs);
				Clinic clinic = clinicman.getClinicManager(prs.getId_prs());
				RequestDispatcher dispatcher = request.getRequestDispatcher("managerClinic.jsp");
				request.setAttribute("hm", clinic);
				System.out.println(clinic + "sdflkj");
				dispatcher.include(request, response);
				response.sendRedirect("indexManager.jsp");
			} else if (status.equals("password incorrect")) {
				request.setAttribute("test", status);
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			} else {
				request.setAttribute("test", status);
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			}

		} catch (Exception e) {

		}
	}

}
