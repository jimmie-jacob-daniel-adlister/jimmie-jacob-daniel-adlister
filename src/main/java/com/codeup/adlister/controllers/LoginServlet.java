package com.codeup.adlister.controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HelloWorldServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/");
            return;
        }

        request.getRequestDispatcher("/WEB-INF/login.jsp");
    }
}
