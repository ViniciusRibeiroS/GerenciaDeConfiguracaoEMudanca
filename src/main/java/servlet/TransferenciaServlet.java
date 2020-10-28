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



@WebServlet("/TransferenciaServlet")
public class TransferenciaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TransferenciaServlet() {
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
			Cliente c2 = new Cliente("Aluno", 100, 456);
			
			int valorTransferencia =  Integer.valueOf(request.getParameter("valor"));
			

			c.transferencia(c2, valorTransferencia, 456);
			 			
			request.setAttribute("saldo", c.getSaldo());
			request.setAttribute("saldo2", c2.getSaldo());
			request.setAttribute("nome", c.getNomeCliente());
			request.setAttribute("nome2", c2.getNomeCliente());
			request.setAttribute("numeroConta", c.getNumeroConta());
			request.setAttribute("numeroConta2", c2.getNumeroConta());
			request.setAttribute("valorTransferido", valorTransferencia);
						
			RequestDispatcher view = request.getRequestDispatcher("sucesso.jsp");
			
			view.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}