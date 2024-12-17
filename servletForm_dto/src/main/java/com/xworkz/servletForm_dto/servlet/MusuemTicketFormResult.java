package com.xworkz.servletForm_dto.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/musuem", loadOnStartup = 1)
public class MusuemTicketFormResult extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String customerName= req.getParameter("customer name");
        String special = req.getParameter("special");
        String normal = req.getParameter("normal");
        String mobile = req.getParameter("mobile");
        String email = req.getParameter("email");

        RequestDispatcher dispatcher = req.getRequestDispatcher("MusuemTicketResult.jsp");
        req.setAttribute("customer name", customerName);
        req.setAttribute("special", special);
        req.setAttribute("normal",normal);
        req.setAttribute("mobile", mobile);
        req.setAttribute("email", email);
        dispatcher.forward(req, resp);
    }
}
