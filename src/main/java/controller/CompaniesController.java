package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Post;

@WebServlet(urlPatterns = {"/company/form", "/companies/insert"})
public class CompaniesController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		String action = req.getRequestURI();

		switch (action) {
		case "/crud-manager/company/form": {
			CommonsController.listUsers(req);
			req.setAttribute("action", "insert");
			ControllerUtil.forward(req, resp, "/form-company.jsp");
			break;
		}
		case "/crud-manager/post/update": {

			break;
		}
		default:

		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getRequestURI();

		if (action == null || action.equals("") ) {
			ControllerUtil.forward(req, resp, "/form-company.jsp");
			return;
		}

		switch (action) {

		case "/crud-manager/post/insert": {

			break;
		}
		default:
			System.out.println("URL inválida " + action);
		}
	}
}



