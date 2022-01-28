package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import beans.Clinic;

/**
 * Servlet implementation class ClinicManager
 */
public class ClinicManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShowClinicList clinicman = null;
    public ClinicManager() {
        super();
        clinicman = new ShowClinicList();
    }
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Clinic clinic = clinicman.getClinicManager(1);
		System.out.print("mfjsdf");
		RequestDispatcher dispatcher = request.getRequestDispatcher("managerClinic.jsp");
        request.setAttribute("hm", clinic);
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
