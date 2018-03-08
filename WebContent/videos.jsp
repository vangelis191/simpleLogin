<%-- 
    Document   : videos
    Created on : 03-Jul-2017, 12:43:42
    Author     : vange
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <%
            if (session.getAttribute("username") == null) {
                response.sendRedirect("login.html");

            }
         
           

            System.out.println(session.getAttribute("username"));
        %>
        
        <iframe width="560" height="315" src="https://www.youtube.com/embed/2zZ7THiluXY" frameborder="0" allowfullscreen></iframe>
        <form action="Logout">
            
            <br /> <br />
            <input type="submit" value="Logout"/>
            
        </form>
    
    </body>
       
</html>
