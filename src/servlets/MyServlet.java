package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener los parámetros del formulario
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");

        // Configurar los atributos para pasarlos al JSP
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("tel", tel);

        // Redirigir a la página result.jsp
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
