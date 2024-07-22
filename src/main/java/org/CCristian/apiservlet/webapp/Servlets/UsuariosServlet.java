package org.CCristian.apiservlet.webapp.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.CCristian.apiservlet.webapp.Models.Usuarios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/SvUsuarios")
public class UsuariosServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String dni = req.getParameter("dni");
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String telefono = req.getParameter("telefono");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Usuarios> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuarios("12345678A", "Juan", "Perez", "123456789"));
        listaUsuarios.add(new Usuarios("23456789B", "Maria", "Gonzalez", "234567890"));
        listaUsuarios.add(new Usuarios("34567890C", "Carlos", "Rodriguez", "345678901"));
        listaUsuarios.add(new Usuarios("45678901D", "Ana", "Martinez", "456789012"));
        listaUsuarios.add(new Usuarios("56789012E", "Luis", "Lopez", "567890123"));
        listaUsuarios.add(new Usuarios("67890123F", "Jose", "Sanchez", "678901234"));
        listaUsuarios.add(new Usuarios("78901234G", "Laura", "Fernandez", "789012345"));
        listaUsuarios.add(new Usuarios("89012345H", "David", "Garcia", "890123456"));
        listaUsuarios.add(new Usuarios("90123456I", "Elena", "Hernandez", "901234567"));
        listaUsuarios.add(new Usuarios("01234567J", "Jorge", "Ramirez", "012345678"));

        HttpSession miSesion = req.getSession();
        miSesion.setAttribute("listaUsuarios",listaUsuarios);
        resp.sendRedirect(req.getContextPath() + "/mostrarUsuarios.jsp");

    }
}
