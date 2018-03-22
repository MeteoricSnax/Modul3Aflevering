<%-- 
    Document   : shoppingcart
    Created on : 22-03-2018, 12:11:20
    Author     : Jesper Outzen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shoppingcart</title>
    </head>
    <body>
        <%@include file="includes/topmenu.jsp" %>
        <h1>Shoppingcart!</h1>
        <p>Logged in as: <%=session.getAttribute("email")%>.</p>
        
    </body>
</html>
