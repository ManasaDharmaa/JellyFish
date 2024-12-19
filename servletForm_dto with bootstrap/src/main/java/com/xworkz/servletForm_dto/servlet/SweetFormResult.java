package com.xworkz.servletForm_dto.servlet;

import com.xworkz.servletForm_dto.dto.SweetFormdto;
import com.xworkz.servletForm_dto.impl.SweetImpl;
import com.xworkz.servletForm_dto.service.SweetFormService;

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


       String shopName = req.getParameter("shop_name" );
       String sweetName = req.getParameter("sweet_name");
      boolean  special =  Boolean.parseBoolean(req.getParameter("order_type"));
      int quantity =  Integer.parseInt(req.getParameter("quantity"));



        SweetFormdto dto = new SweetFormdto(shopName, sweetName, special, quantity);

        SweetFormService service = new SweetImpl();
        boolean result = service.sweetService(dto);

      String message = "Order Confirmation Shop Name: " + dto.getShopName()+
              " Sweet Name:" + dto.getSweetName() + " Type :" +  dto.isSpecial() +" " +
              " Quantity : " + dto.getQuantity() + "Ordered Successfully! ";
        RequestDispatcher dispatcher = req.getRequestDispatcher("SweetForm.jsp");

        String invalid = "invalid information";

        if(quantity <= 3 && quantity >= 30 && result == true) {


            req.setAttribute("message", message);
            req.getRequestDispatcher("SweetForm.jsp").forward(req, resp);

        } else {
            req.getRequestDispatcher("SweetForm.jsp").forward(req, resp);
            req.setAttribute("message", "not saved");
        }




    }
}
