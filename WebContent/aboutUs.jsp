
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>this is information about us</h3>
        
        <%
            if (session.getAttribute("username") == null) {
                response.sendRedirect("login.html");

            }
         
           out.print(session.getAttribute("username"));
        %>
        <br /> <br /> 
        <form action="Logout">
   <input type="submit" value="Logout"/>
            
        </form>
    </body>
</html>
