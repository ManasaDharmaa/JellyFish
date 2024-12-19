package com.xworkz.servletForm_dto.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cricket", loadOnStartup = 1)
public class CricketTournamentFormResult extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String team = req.getParameter("team");
       String member =  req.getParameter("member");
       String name = req.getParameter("name");
       String extra = req.getParameter("extra");
       String left = req.getParameter("left");
       String right = req.getParameter("right");
       String bowlers = req.getParameter("bowlers");
       String batman = req.getParameter("batman");

        RequestDispatcher dispatcher = req.getRequestDispatcher("CricketResult.jsp");
        req.setAttribute("team", team);
        req.setAttribute("member", member);
        req.setAttribute("name", name);
        req.setAttribute("extra", extra);
        req.setAttribute("left", left);
        req.setAttribute("right", right);
        req.setAttribute("bowlers", bowlers);
        req.setAttribute("batman", batman);
        dispatcher.forward(req, resp);


    }
}
