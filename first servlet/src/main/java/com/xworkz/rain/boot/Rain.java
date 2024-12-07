package com.xworkz.rain.boot;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(urlPatterns = "/rain", loadOnStartup = 1)
public class Rain extends HttpServlet {

    public Rain(){
        System.out.println("this is first servlet program");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("first servlet");
        String str = req.getRequestURL().toString();
        System.out.println(str);
        Enumeration<String> enumeration =req.getHeaderNames();
        while (enumeration.hasMoreElements()){
           String eliment = enumeration.nextElement();
           String value = req.getHeader(eliment);
            System.out.println(eliment + " " + value);
        }

        PrintWriter print = resp.getWriter();
        print.println("this is response");
    }
}
