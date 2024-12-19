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


        String customerName= req.getParameter("customer_name");
        String special = req.getParameter("ticketType");
        String normal = req.getParameter("ticketType");
        String mobile = req.getParameter("mobile");
        String email = req.getParameter("email");
        String invalid = "invalid information";


        if(Character.isUpperCase(customerName.charAt(0)) && email.contains("@gmail.com")) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("MusuemTicketResult.jsp");

            req.setAttribute("customerName", customerName);
            req.setAttribute("special", special);
            req.setAttribute("normal",normal);
            req.setAttribute("mobile", mobile);
            req.setAttribute("email", email);
            dispatcher.forward(req, resp);
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("invalid.jsp");

            req.setAttribute("invalid", invalid);
            dispatcher.forward(req,resp);
        }


    }
}
