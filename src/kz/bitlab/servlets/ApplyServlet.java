package kz.bitlab.servlets;
import kz.bitlab.db.Contact;
import kz.bitlab.db.DBManager;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/apply")
public class ApplyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("HELLO APPLY");
    }

    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException {
     String name = request.getParameter("user_name");
     String surname = request.getParameter("user_surname");
     String age = request.getParameter("user_age");

        Contact contact= new Contact();
        contact.setName(name);
        contact.setSurname(surname);
        contact.setAge(age);
        DBManager.addContact(contact);

        response.sendRedirect("/home");
    }
}