package com.xworkz.servlet_jsp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/file", loadOnStartup = 1)
public class Ornaments extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doPost is  running");
        String name = req.getParameter("name");
        String grams = req.getParameter("Grams");
        String per = req.getParameter("Grams per cost");
        String gst = req.getParameter("gst");
        String service = req.getParameter("service rate");


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("OrnamentResult.jsp");
        req.setAttribute("name", name);
        req.setAttribute("grams", grams);
        req.setAttribute("per", per);
        req.setAttribute("gst", gst);
        req.setAttribute("service rate", service);

        requestDispatcher.forward(req, resp);

    }
}
