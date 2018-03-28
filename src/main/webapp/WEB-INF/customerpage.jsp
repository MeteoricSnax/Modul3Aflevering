
<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    

    <body>
        <%@include file="../includes/topmenu.jsp" %>
                
        <h1>Welcome <%=session.getAttribute("email")%>! </h1>
        
        

 
        
    </body>
</html>
