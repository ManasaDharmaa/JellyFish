package com.xworkz.servletForm_dto.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/milk", loadOnStartup = 1)
public class MilkFormResult extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, Double> map = new HashMap<String, Double>();

        map.put("Special", 25.0);
        map.put("Ordinary", 27.0);
        map.put("Good Life", 35.0);
        map.put("Family", 22.0);
        map.put("Buffalo", 28.0);
        map.put("Good Life lite", 29.0);

        String brand =req.getParameter("brand");
        String type = req.getParameter("type");
        int quality = Integer.parseInt(req.getParameter("quantity"));



        double costPerHalfLiter = map.get(type);
        double costperLitter = costPerHalfLiter * 2;
        double cost = costperLitter * quality;



        RequestDispatcher dispatcher =  req.getRequestDispatcher("MilkResult.jsp");
        req.setAttribute("brand" , brand);
        req.setAttribute("type" , type);
        req.setAttribute("quality" , quality);
        req.setAttribute("cost" , cost);
        dispatcher.forward(req, resp);

    }
}
