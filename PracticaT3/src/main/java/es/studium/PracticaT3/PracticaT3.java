package es.studium.PracticaT3;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ejercicio21
 */
@WebServlet("/PracticaT3")
public class PracticaT3 extends HttpServlet {
	Modelo modelo = new Modelo();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PracticaT3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String palabrasInput = request.getParameter("palabra");
        char letra = request.getParameter("letra").charAt(0);

        List<String> palabrasFiltradas = Modelo.filtrarPalabrasPorLetra(palabrasInput, letra);
        
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html lang=\"es\">");
        response.getWriter().println("<head>");
        response.getWriter().println("<meta charset=\"UTF-8\">");
        response.getWriter().println("<title>Palabras filtradas</title>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Palabras que contienen la letra '" + letra + "':</h1>");
        response.getWriter().println("<ul>");
        for (String palabra : palabrasFiltradas) {
            response.getWriter().println("<li>" + palabra + "</li>");
        }
        response.getWriter().println("</ul>");

        // Botón para volver a la página principal
        response.getWriter().println("<a href=\"index.html\">Volver a la página principal</a>");

        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }

}