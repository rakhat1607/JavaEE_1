package kz.bitalb.homework_1_2;

import kz.bitlab.db.Contact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet( value = "/home2")
public class HomeServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");

        out.print("<div class = 'container'>");
        out.print("<div class = 'row mt-4'>");
        out.print("<div class = 'col-10 mx-auto'>");
        out.print("<table class = 'table table-bordered'>");
        out.print("<thead>");
        out.print("<thead>");
        out.print("<tr><th>NAME</th><th>SURNAME</th><th>DEPARTAMENT</th><th>SALARAY</th></tr>");
        out.print("</thead>");
        out.print("<tbody>");
        ArrayList<Users> users = DataUsers.getAllContacts();

        for (Users usr : users){
                out.println("<tr><td>"+ usr.getName() + "</td><td>" + usr.getSurname() + "</td><td>" + usr.getDepartament() + " </td><td>" + usr.getSalary() + "</td></tr>");
            }
            out.print("</tbody>");
            out.print("</table>");
            out.print("</div>");
            out.print("</div>");
            out.print("</div>");

        out.print("</body>");
        out.print("</html>");









    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
