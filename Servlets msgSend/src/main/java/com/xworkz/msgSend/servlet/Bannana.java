package com.xworkz.msgSend.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/send", loadOnStartup = 1)
public class Bannana extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String Quantity = req.getParameter("Quantity");

        int priceValue = Integer.parseInt(price);
        int qnt = Integer.parseInt(Quantity);
        int  TotalCost =  priceValue * qnt;

        PrintWriter writer = resp.getWriter();
        writer.println("Former Name : " + name + " price : " + price + " Quantity " + Quantity + " total cost : " + TotalCost);

    }
}
