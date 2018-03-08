
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
        <h1>Hello ${username}!</h1>

        <a href="videos.jsp">Videos here</a>
        <a href="aboutUs.jsp">about us</a>
    </body>
</html>
