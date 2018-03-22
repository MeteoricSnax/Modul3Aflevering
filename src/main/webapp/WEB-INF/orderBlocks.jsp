<%-- 
    Document   : orderBlocks
    Created on : 20-03-2018, 13:48:46
    Author     : Jesper Outzen
--%>

<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="includes/topmenu.jsp" %>
        <h1>Order Blocks here</h1>
        <p>Logged in as: <%=session.getAttribute("email")%>.</p>
        
        
        
    </body>
</html>
