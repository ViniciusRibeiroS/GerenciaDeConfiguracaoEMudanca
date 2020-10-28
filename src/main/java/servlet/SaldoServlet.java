package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Cliente;



@WebServlet("/SaldoServlet")
public class SaldoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaldoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {			
			Cliente c = new Cliente("Gibeon", 600, 123);
			 			
			request.setAttribute("saldo", c.getSaldo());
			request.setAttribute("nome", c.getNomeCliente());
			request.setAttribute("numeroConta", c.getNumeroConta());
			
						
			RequestDispatcher view = request.getRequestDispatcher("sucesso.jsp");
			
			view.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}