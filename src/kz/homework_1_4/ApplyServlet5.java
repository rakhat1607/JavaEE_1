package kz.homework_1_4;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/apply5")
public class ApplyServlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String fullName = request.getParameter("user_name");
        int age = Integer.parseInt(request.getParameter("user_age"));
        PrintWriter out = response.getWriter();
        if (request.getParameter("user_gender") != null){
            if(request.getParameter("user_gender").equals("man")){
                if(age >= 18){
                    out.println("Hello Dear Mister " + fullName   );
                }
                else{
                    out.println("Hello Dude Mister " + fullName   );

                }

            }
            else {
                if(age >= 18){
                    out.println("Hello Dear Miss " + fullName   );
                }
                else{
                    out.println("Hello Dude Miss " + fullName   );
                }
            }
        }

    }
}