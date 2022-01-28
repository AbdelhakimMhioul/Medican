package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteClinic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShowClinicList htldb = null;

	public DeleteClinic() {
		super();
		htldb = new ShowClinicList();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		htldb.deleteClinic(id);
		RequestDispatcher requestdis = request.getRequestDispatcher("/ClinicManager");
		requestdis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
