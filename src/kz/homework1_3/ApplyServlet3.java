package kz.homework1_3;

import kz.bitalb.homework_1_2.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/apply3")
public class ApplyServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String name =request.getParameter("user_name");
        String surname = request.getParameter("user_surname");



        PrintWriter out = response.getWriter();
        out.println("<h1>"+ name +  " " +    surname +"</h1>");
    }
}
