package com.xworkz.servletChaining.servlet;

import com.xworkz.servletChaining.dto.Cricketdto;
import com.xworkz.servletChaining.impl.CricketServiceImpl;
import com.xworkz.servletChaining.service.CricketService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = "/cricket", loadOnStartup = 1)
public class CricketServlet extends HttpServlet {

    private CricketService cricketService = new CricketServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("team_name");
        String captain = req.getParameter("Captain");
        String country = req.getParameter("country");
        String owner = req.getParameter("owner");
        String ambassador = req.getParameter("ambassador");
        double budget = Integer.parseInt(req.getParameter("budget"));
        int players = Integer.parseInt(req.getParameter("players"));
        int extraPlayers = Integer.parseInt(req.getParameter("extra_players"));

        Cricketdto cricketdto = new Cricketdto();
        cricketdto.setTeamName(name);
        cricketdto.setCaptain(captain);
        cricketdto.setCountry(country);
        cricketdto.setOwner(owner);
        cricketdto.setAmbassador(ambassador);
        cricketdto.setBudget(budget);
        cricketdto.setPlayers(players);
        cricketdto.setExtra_players(extraPlayers);

        cricketService.save(cricketdto);

        String message = "Team Name : "+ cricketdto.getTeamName()+", captain : " + cricketdto.getCaptain()+
                ", country : " + cricketdto.getCountry()+ ", owner : " + cricketdto.getOwner()+
                ", ambassador : "+ cricketdto.getAmbassador() + ", budget : "+ cricketdto.getBudget()+
                ", tottal players : " + cricketdto.getPlayers()+ ", extra players "+cricketdto.getExtra_players();

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Cricket.jsp");
        req.setAttribute("message", message);
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Cricketdto>  cricketdtoList = this.cricketService.getAll();

        RequestDispatcher  requestDispatcher = req.getRequestDispatcher("CricketResult.jsp");
        req.setAttribute("list", cricketdtoList);
        requestDispatcher.forward(req, resp);
    }
}
