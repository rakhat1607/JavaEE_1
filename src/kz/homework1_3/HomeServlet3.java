package kz.homework1_3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.DoublePredicate;

@WebServlet (value = "/home3")
public class HomeServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<form action='/apply3' method='post'>");
        out.print("<div class ='container'>");
        out.print("<div clas = 'col 10 mx-auto'>");
        out.print("<div class='form-floating mb-3' style = 'padding: 10px'>" );
        out.print("<input type='text' class='form-control' name='user_name' >");
        out.print("<label for='floatingInput'>NAME</label>");
        out.print("</div>");
        out.print("<div class='form-floating' style = 'padding: 10px'>");
        out.print("<input type='text' class='form-control' name='user_surname' >");
        out.print("<label for='floatingPassword'>SURNAME</label>");
        out.print("</div>");
        out.print("<div style = 'padding: 10px'>");
        out.print("<button >SEND</button>");
        out.print("</div>");
        out.print("</div>");
        out.print("</div>");
        out.print("</form>");
        out.print("</body>");
        out.print("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
