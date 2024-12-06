package com.xworkz.msgSend.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/send", loadOnStartup = 1)
public class Mango extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String teamName = req.getParameter("team Name");
        String noOfPlayers = req.getParameter("no Of Players");
        String captainName = req.getParameter("captain Name");
        String totalWonMatchs = req.getParameter("total Won Matchs");
        String totalloseMatchs = req.getParameter("total lose Matchs");
        String mostFamousCricketer = req.getParameter("most Famous Cricketer");
        String sponsors1 = req.getParameter("sponsors 1");
        String sponsors2 = req.getParameter("sponsors 2");
        String sponsors3 = req.getParameter("sponsors 3");
        String player1 =  req.getParameter("player 1");
        String player2 =  req.getParameter("player 2");
        String player3 =  req.getParameter("player3");
        String player4 =  req.getParameter("player4");
        String player5 =  req.getParameter("player5");
        String player6 =  req.getParameter("player6");
        String player7 =  req.getParameter("player7");
        String player8 =  req.getParameter("player8");
        String player9 =  req.getParameter("player9");
        String player10 =  req.getParameter("player10");
        String player11 =  req.getParameter("player11");
        String player12 =  req.getParameter("player12");
        String player13 =   req.getParameter("player13");
        String player14 =  req.getParameter("player14");
        String player15 = req.getParameter("player15");
        String player16 =  req.getParameter("player16");
        String funds =  req.getParameter("funds");
        String no1richestCricketer =  req.getParameter("no 1 richest Cricketer");
        String viratJersyNo =  req.getParameter("virat Jersy No");


        PrintWriter writer = resp.getWriter();
        writer.println("team Name : " + teamName + " no Of Players : " + noOfPlayers + " captainName : " +
                captainName + " total Won Matchs : " + totalWonMatchs + " total lose Matchs : " + totalloseMatchs +
                " most Famous Cricketer : " + mostFamousCricketer + " sponsors 1 : " + sponsors1 + " sponsors 2 : " +
                sponsors2 + " sponsors 3 : " + sponsors3 + " player 1 : " + player1 + " player 2 : " + player2 +
                " player 3 : " + player3 + " player 4 : " + player4 + " player 5 : " + player5 + " player 6 : " + player6 +
                " player 7 : " + player7 + " player 8 : " + player8 + " player 9 : " + player9 +
                " player 10 : " + player10 + " player 11 : " + player11 + " player 12 : " + player12 +
                " player 13 : " + player13 + " player 14 : " + player14 + " player 15 : " + player15 +
                " player 16 : " + player16 + " funds : " + funds + " no 1 richest Cricketer : " + no1richestCricketer +
                " virat Jersy No : " + viratJersyNo);


    }
}
