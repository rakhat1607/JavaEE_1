package kz.bitlab.servlets;




import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;



@WebServlet(value = "/home")

public class HomeServlet extends HttpServlet {



    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) {

    }



    @Override

    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        for (int i = 0; i < 10; i++) {


        out.print("<h1>First BITLAB Java EE Application</h1>");
        }
    }

}