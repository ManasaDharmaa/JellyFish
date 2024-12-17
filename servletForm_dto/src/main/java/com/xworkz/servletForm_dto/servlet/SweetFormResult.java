package com.xworkz.servletForm_dto.servlet;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/sweet" , loadOnStartup = 1)
public class SweetFormResult extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


       String shopName = req.getParameter("shop name" );
       String sweetName = req.getParameter("sweet name");
      String special =  req.getParameter("Special");
      String normal =   req.getParameter("Normal");
      String quantity =  req.getParameter("quantity");

        RequestDispatcher dispatcher = req.getRequestDispatcher("SweetResult.jsp");

        req.setAttribute("shopName", shopName);
        req.setAttribute("sweetName", sweetName);
        req.setAttribute("special", special);
        req.setAttribute("normal", normal);
        req.setAttribute("quantity", quantity);
        dispatcher.forward(req,resp);


    }
}
