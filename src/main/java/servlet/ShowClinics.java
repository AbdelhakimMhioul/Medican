package servlet;

import java.io.IOException;
import java.util.ArrayList;

import beans.Clinic;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ShowClinics extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ShowClinicList clinics = null;

	public ShowClinics() {
		super();
		clinics = new ShowClinicList();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		ArrayList<Clinic> clinicList = clinics.ShowList();
		request.setAttribute("clinicList", clinicList);
		request.getRequestDispatcher("showclinics.jsp").include(request, response);
	}

}
