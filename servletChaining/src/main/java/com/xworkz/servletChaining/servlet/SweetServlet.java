package com.xworkz.servletChaining.servlet;

import com.xworkz.servletChaining.dto.Sweetdto;
import com.xworkz.servletChaining.impl.SweetServiceImpl;
import com.xworkz.servletChaining.service.SweetService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/sweet", loadOnStartup = 1)
public class SweetServlet extends HttpServlet {

private SweetService sweetService = new SweetServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, Double> map = new HashMap<>();

        map.put("jammun", 200.0);
        map.put("jilebi", 100.0);
        map.put("laddu", 250.0);
        map.put("mysorepak", 300.0);


       String shopName = req.getParameter("shop name");
       String sweetName = req.getParameter("sweet name");
       int quantity = Integer.parseInt(req.getParameter("quantity"));




        double cost = map.get(sweetName);
        double price = cost * quantity;

        Sweetdto sweetdto = new Sweetdto();
        sweetdto.setShopName(shopName);
        sweetdto.setSweetName(sweetName);
        sweetdto.setQuantity(quantity);
        sweetdto.setCost(price);


        sweetService.save(sweetdto);
        String message = "shop name : "+ sweetdto.getShopName()+ " sweet name : "+
                sweetdto.getSweetName()+ " quantity : " + sweetdto.getQuantity()+ " price : " + sweetdto.getCost();


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Sweet.jsp");
        req.setAttribute("message", message);

        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Sweetdto> sweetdtoList = this.sweetService.getAll();
        req.setAttribute("list", sweetdtoList);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("SweetResult.jsp");
        requestDispatcher.forward(req, resp);
    }
}
