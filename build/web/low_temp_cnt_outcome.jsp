<%-- 
    Document   : low_temp_cnt_outcome
    Created on : 05 Jun 2024, 14:06:48
    Author     : Sifiso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        Long lowcnt = (Long)request.getAttribute("lowcnt");
        
        
        %>
    <body>
        <p>
            There are <b><%=lowcnt%></b> employess with low temperature reading. 
        </p>
        <p>
            Please click <a href="menu.html">here</a> to go back to the menu page.
        </p>
        <p>
            Please click <a href="index.html">here</a> to go back to the main page.
        </p>
        <p>
            Please click <a href="LogoutServlet.do">here</a> to go back to the menu page.
        </p>
    </body>
</html>
