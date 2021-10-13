package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Antony
 */
@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //Recibe los datos del formulario index
       String nombre = request.getParameter("nombre");
       String telefono = request.getParameter("telefono");
       String correo = request.getParameter("correo");
       //Instanciamos un objeto a partir de la clase Persona
       Persona per=new Persona();
       //Encapsulamos los datos recibidos en el objeto per
       per.setNombre(nombre);
       per.setTelefono(telefono);
       per.setCorreo(correo);
       //Colocar al objeto per como atributo de request
       request.setAttribute("persona", per);
       //Enviamos al formulario output.jsp
       request.getRequestDispatcher("output.jsp").forward(request, response);
    }
   
}
