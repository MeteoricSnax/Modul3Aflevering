<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.LogicFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>
        <%@include file="../includes/topmenu.jsp" %>
        <h1>logged in as <%=session.getAttribute("role")%>: <%=session.getAttribute("email")%>. </h1>
        
        <a href="FrontController?command=logout" class="button">Log Out</a>
        
        
        
    </body>
</html>
