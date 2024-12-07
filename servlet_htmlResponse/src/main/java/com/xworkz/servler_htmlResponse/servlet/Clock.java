package com.xworkz.servler_htmlResponse.servlet;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/clock", loadOnStartup = 1)
public class Clock extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           String brand = req.getParameter("brand name");
           String type = req.getParameter("type");
           String color = req.getParameter("color");
           String shape = req.getParameter("shape");

        System.out.println("brand name : " + brand);
        System.out.println("clock type : " + type);
        System.out.println("clock color : " + color);
        System.out.println("clock shape : " + shape);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<style>");
        writer.println("h1 {");
        writer.println("color : blue;");
        writer.println("text-align : center;");
        writer.println("}");
        writer.println("h3 {");
        writer.println("color : green;");
        writer.println("text-align : center;");
        writer.println("}");
        writer.println("p {");
        writer.println("color : black;");
        writer.println("text-align : center;");
        writer.println("}");
        writer.println("</style>");
        writer.println("</head>");
        writer.println("<body bgcolor=pink>");
        writer.println("<h1 color=red>");
        writer.println("You Selected Clock Details");
        writer.println("</h1>");
        writer.println("<h3>");
        writer.print("You selected brand : ");
        writer.println("</h3>");
        writer.println("<p>");
        writer.println(brand);
        writer.println("</p>");
        writer.println("<h3>");
        writer.print("You selected clock type : ");
        writer.println("</h3>");
        writer.println("<p>");
        writer.println(type);
        writer.println("</p>");
        writer.println("<h3>");
        writer.print("You selected clock color : ");
        writer.println("</h3>");
        writer.println("<p>");
        writer.println(color);
        writer.println("</p>");
        writer.println("<h3>");
        writer.print("You selected clock shape : ");
        writer.println("</h3>");
        writer.println("<p>");
        writer.println(shape);
        writer.println("</p>");
        writer.println("</body>");
        writer.println("</html>");


    }
}
