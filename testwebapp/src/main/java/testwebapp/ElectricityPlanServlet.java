package testwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import testapp.*;

public class ElectricityPlanServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8711681704619975249L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		String electricytyPlan = request.getParameter("plan");

		Plan plan = new GetPlanFactory().getPlan(electricytyPlan);

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		if (plan != null) {
			out.println("<h1>" + plan.getPlanName() + "</h1>");
		} else {
			out.println("<h1>No plan selected</h1>");
		}
	}

}
