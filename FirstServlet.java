package edu.wctc.dj.first;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;



public class FirstServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String html = "<html><body>Hi. I received param1=" +

                request.getParameter("param1") +
                " via GET</body><html>";
        response.getOutputStream().println(html);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String html = "<html><body>Hi. I received param1=" +
                request.getParameter("param1") +
                " via POST</body><html>";
        response.getOutputStream().println(html);}
}
//what am I doing