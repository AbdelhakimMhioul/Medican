package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import beans.Clinic;

/**
 * Servlet implementation class EditClinic
 */
public class EditClinic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ShowClinicList clinicdb = null;

	public EditClinic() {
		super();
		clinicdb = new ShowClinicList();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Clinic clinic = clinicdb.findClinicById(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ClinicForm.jsp");
		request.setAttribute("hm", clinic);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
