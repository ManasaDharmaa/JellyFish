package com.xworkz.msgSend.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/send", loadOnStartup = 1)
public class Apple extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String type = req.getParameter("type");
       String grownIn = req.getParameter("grownIn");
       String imported = req.getParameter("imported");
       String color = req.getParameter("color");
       String price = req.getParameter("price");

        int priceValue = Integer.parseInt(price);
       int cost = priceValue * 120;

        PrintWriter print = resp.getWriter();
        print.println("Succefully submmited  Apple details  : Apple  type : " + type +" grown in : " +  grownIn + " imported : " + imported + " color : " + color + " price per kg : " + cost );
    }
}
