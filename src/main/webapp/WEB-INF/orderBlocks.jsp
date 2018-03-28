
<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%User user = (User) session.getAttribute("user");%> 
        <%@include file="../includes/topmenu.jsp" %>
        <h1>Order Blocks here</h1>
        <p>Logged in as: <%=session.getAttribute("email")%>.</p>

        <p>Placing a order requires you to input a length, the depth and the heigth of your desired house.</p>

        <%-- Input Length, Depth and Height of your desired House 
             Height and Length min value is set to 5
             Id = userid
        --%>
        <form action="FrontController" method="post" id="createOrder">
            <input type="hidden" name="userid" value ="<%= user.getId()%>" />
            <input type="number" name="length" placeholder="Length" min="5" max="100" required />
            <input type="number" name="depth" placeholder="Depth" min="5" max="100" required />
            <input type="number" name="height" placeholder="Height" min="1" max="100" required />
            <input type="hidden" name="command" value="productv2" />
            <br>
            <input type="submit" value="CREATE ORDER" class="button2" />
        </form>

    </body>
</html>
