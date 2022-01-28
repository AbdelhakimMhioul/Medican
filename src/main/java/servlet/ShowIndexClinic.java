package servlet;

import java.io.IOException;
import java.util.ArrayList;

import beans.Clinic;
import db.ShowClinicList;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ShowIndexClinic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowIndexClinic() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ShowClinicList shl = new ShowClinicList();
		String ville = request.getParameter("ville");
		String date_init = request.getParameter("date_init");
		System.out.println(date_init);
		String date_end = request.getParameter("date_end");
		String prs = request.getParameter("personne");
		String ch = request.getParameter("chambre");
		ArrayList<Clinic> indexclinicList = shl.SearchClinics(ville, date_init, date_end, prs, ch);
		request.setAttribute("indexclinicList", indexclinicList);

		request.getRequestDispatcher("/showindexclinics.jsp").forward(request, response);
	}

}
