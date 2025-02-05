package cl.desafioLatam.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafioLatam.exceptions.NumeroNoEnteroException;
import cl.desafioLatam.model.Operacion;
import cl.desafioLatam.servicio.OperacionServicio;
import cl.desafioLatam.utilidad.Utilidad;

/**
 * Servlet implementation class MostrarResultados
 */
@WebServlet("/MostrarResultados")
public class MostrarResultados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarResultados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numA =0;
		int numB =0;
		 
		try {
			numA = Utilidad.parsearValidarEntero(request.getParameter("TxtNumA"));
			numB = Utilidad.parsearValidarEntero(request.getParameter("TxtNumB"));
			
			Operacion operacion = new Operacion(numA, numB);
			OperacionServicio operacionServicio = new OperacionServicio(operacion, request.getParameter("operacionSelect"));
			String resultado = operacionServicio.seleccionOperacion();
			resultado = Utilidad.saltodelineaJvtoHtml(resultado);
			request.setAttribute("resultado", resultado);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
			
		} catch (NumeroNoEnteroException e) {
			String msjError = e.getMessage();
			msjError = Utilidad.saltodelineaJvtoHtml(msjError);
			request.setAttribute("resultado", msjError);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	

	}

}
