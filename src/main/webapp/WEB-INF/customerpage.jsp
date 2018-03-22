<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    

    <body>
        <%@include file="includes/topmenu.jsp" %>
        <h1>sessiontest: <%=session.getAttribute("id")  %> </h1>
        
        <h1>logged in as <%=session.getAttribute("role")%>: <%=session.getAttribute("email")%>. </h1>
        
        <a href="FrontController?command=logOut" class="button">Log Out</a>

 
        
    </body>
</html>
