package com.xworkz.servletChaining.servlet;

import com.xworkz.servletChaining.dto.Musuemdto;
import com.xworkz.servletChaining.impl.MusuemServiceImpl;
import com.xworkz.servletChaining.service.MusuemService;

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

@WebServlet(urlPatterns = "/musuem", loadOnStartup = 1)
public class MusuemServlet extends HttpServlet {

    private MusuemService musuemService = new MusuemServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      Map<String, Double> map = new HashMap<>();

      map.put("adult", 250.0);
      map.put("child", 100.0);

        String name = req.getParameter("name");
        String adultOrChild =req.getParameter( "adult-child");
        long mobile = Long.parseLong(req.getParameter("mobile"));
        String email = req.getParameter("email");

        double cost = map.get(adultOrChild);

        Musuemdto musuemdto = new Musuemdto();
        musuemdto.setName(name);
        musuemdto.setAorC(adultOrChild);
        musuemdto.setNumber(mobile);
        musuemdto.setEmail(email);
        musuemdto.setCost(cost);

       musuemService.save(musuemdto);

       String message = "name : " + musuemdto.getName()+" Autult or child : "+musuemdto.getAorC()+
               " Mobile number : " + musuemdto.getNumber()+" Email : "+ musuemdto.getEmail()+
               " ticket cost : " + musuemdto.getCost();

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Musueum.jsp");
        req.setAttribute("message",message);
        requestDispatcher.forward(req,resp);



    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Musuemdto> musuemdtoList = this.musuemService.getAll();

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("MusuemResult.jsp");
        req.setAttribute("list", musuemdtoList);
        requestDispatcher.forward(req,resp);
    }
}
