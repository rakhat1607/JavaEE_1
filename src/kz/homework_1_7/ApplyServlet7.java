package kz.homework_1_7;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/apply7")
public class ApplyServlet7 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String fullName = request.getParameter("user_name");
        int age = Integer.parseInt(request.getParameter("user_age"));
        PrintWriter out = response.getWriter();
        if (age >=90){
            out.println(fullName + " got 'A' for exam!" );
        } else if (74<age && 90>age) {
            out.println(fullName + " got 'B' for exam!" );

        } else if (75>age && 59<age) {
            out.println(fullName + " got 'C' for exam!" );

        }else if (60>age && 50<age) {
            out.println(fullName + " got 'D' for exam!" );
        }
        else {
            out.println(fullName + " got 'F' for exam!" );

        }


    }
}