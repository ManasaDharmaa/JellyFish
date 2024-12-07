package com.xworkz.servler_htmlResponse.servlet;

import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(urlPatterns = "/image", loadOnStartup = 1)
public class Image extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext contex = req.getServletContext();
        String name = contex.getRealPath("Images/lotus.jpg");
        String mime = contex.getMimeType(name);
        if(mime == null){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            return;
        }
        resp.setContentType(mime);
        File file = new File(name);
        resp.setContentLength((int)file.length());

        FileInputStream in = new FileInputStream(file);
        OutputStream out = resp.getOutputStream();

        byte[] buf = new byte[1024];
        int count =0;
        while ((count = in.read(buf)) >= 0){
            out.write(buf, 0, count);
        }
        out.close();
        in.close();
    }
}
