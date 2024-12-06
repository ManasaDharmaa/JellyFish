package com.xworkz.msgSend.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/send", loadOnStartup = 1)
public class Grapes extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      String name =  req.getParameter("Shop Name");
      String owner =  req.getParameter("Owner Name");
      String rent =  req.getParameter("Shop Rent");
      String gst =  req.getParameter("Shop GST No");
      String address =  req.getParameter("Shop Address");
      String open =  req.getParameter("Shop open time");
      String close =  req.getParameter("Shop close time");
      String worker1 =  req.getParameter("Worker 1");
      String worker2 =  req.getParameter("Worker 2");
      String worker3 =  req.getParameter("Worker 3");
      String worker4 =  req.getParameter("Worker 4");


        PrintWriter writer = resp.getWriter();
        writer.println("Shop Name : " + name + " Owner Name : " + owner + " Shop Rent : " + rent + " Shop GST No : " +
               gst + " Shop Address : " + address + " Shop open time : " + open + " Shop close time : " + close + " worker 1 : " + worker1 + " worker 2 : " + worker2 + " worker 3 : " + worker3 + " worker 4 : " + worker4  );
    }
}
