package com.xworkz.servletChaining.servlet;

import com.xworkz.servletChaining.dto.Milkdto;
import com.xworkz.servletChaining.impl.MilkServiceImpl;
import com.xworkz.servletChaining.repository.MilkRepo;
import com.xworkz.servletChaining.repository.MilkRepoImpl;
import com.xworkz.servletChaining.service.MilkService;

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

@WebServlet(urlPatterns = "/Milk", loadOnStartup = 1)
public class MilkServlet extends HttpServlet {


private MilkService milkService = new MilkServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Map<String, Double> map = new HashMap<>();

        map.put("special", 56.0);
        map.put("ordinary", 54.0);
        map.put("good life", 67.0);
        map.put("good life lite", 68.0);
        map.put("family", 56.0);
        map.put("buffalo", 70.0);

        map.put("normal", 46.0);
        map.put("gold full cream", 43.0);
        map.put("lactose free", 57.0);
        map.put("taaza", 60.0);



     String brand = req.getParameter("brand");
     String type = req.getParameter("type");
     int quantity = Integer.parseInt(req.getParameter("quantity"));

        Milkdto milkdto = new Milkdto();
        milkdto.setBrand(brand);
        milkdto.setType(type);
        milkdto.setQuantity(quantity);

        double price = 0.0;
        double cost = map.get(type);
        price = cost * quantity;
        milkdto.setPrice(price);




         milkService.save(milkdto);

        String message =  milkdto.getBrand()+ " Type : " + milkdto.getType()+ " Quantity : " +  milkdto.getQuantity()+ " Total cost is : " + milkdto.getPrice() ;



        RequestDispatcher dispatcher = req.getRequestDispatcher("Milk.jsp");


            req.setAttribute("message", message);
            dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doGet");

        List<Milkdto> milkdto = this.milkService.getAll();
        req.setAttribute("list", milkdto);

      RequestDispatcher requestDispatcher = req.getRequestDispatcher("MilkResult.jsp");
      requestDispatcher.forward(req,resp);
    }
}
