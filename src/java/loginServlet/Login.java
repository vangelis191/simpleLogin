package loginServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDaoImpl;

public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("uname");
        String password = request.getParameter("pass");
        
       
        if (LoginDaoImpl.validate(uname, password)) {
              System.out.println("Mesa sto login.java for Valid: "+ LoginDaoImpl.validate(uname, password));
            HttpSession session  = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("welcome.jsp");

        } else {
            System.out.println("wrong password sto Login.java");
            response.sendRedirect("login.html");
        }
    }

}
