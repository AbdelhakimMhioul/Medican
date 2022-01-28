package servlet;

import java.io.IOException;

import beans.Clinic;
import db.ClinicDB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddClinic
 */
public class AddClinic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ClinicDB clinicdb;

	public AddClinic() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() {
		clinicdb = new ClinicDB();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
//		PrintWriter out = response.getWriter(); 
//		HttpSession session = request.getSession(true);	
//	    Personne prs = new Personne();
		Clinic cln = new Clinic();
		cln.setId_clinic(0);
		cln.setNom_clinic(request.getParameter("nom"));
		cln.setAdresse_clinic(request.getParameter("adresse"));
		cln.setDescription(request.getParameter("desc"));
		cln.setVille_clinic(request.getParameter("phone"));
		cln.setTel_clinic(request.getParameter("desc"));
		cln.setNbr_etoiles(request.getParameter("stars"));
		cln.setImage_clinic(request.getParameter("photo"));
		cln.setId_prs(1);
		String a = clinicdb.AddClinic(cln);
		System.out.println(a);
		if (a.equals("sc")) {
			request.getRequestDispatcher("/clnadded.jsp").forward(request, response);
		} else {
			request.setAttribute("errMessage", a);
			request.getRequestDispatcher("/addclinic.jsp").forward(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.sendRedirect(req.getServletContext().getContextPath() + "/addclinic.jsp");
	}

}
