

<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.LogicFacade"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../includes/topmenu.jsp" %>


        <h1>All existing orders</h1>
        <p>Below you can see all orders from all users<br> 
            You can also change the delivery status.
        </p>

        <% ArrayList<Order> orders = LogicFacade.getAllOrders(); %>
        <div class="orderTable2">   
            <table class="table">
                <tr>
                    <th>Order ID</th>
                    <th>User ID</th>
                    <th>Length</th>
                    <th>Depth</th>
                    <th>Height</th>
                    <th>Delivered</th>
                </tr>

                <%
                     for (Order o : orders) {%>
                <tr>
                    <td> <%= o.getOrderId()%> </td>  
                    <td> <%= o.getUserId()%> </td>  
                    <td> <%= o.getLength()%> </td>
                    <td> <%= o.getDepth()%> </td>  
                    <td> <%= o.getHeight()%> </td>  
                    <td> <% if (o.isDelivered() == true) { %> in transit <%} else { %> not in transit yet <% } %></td>
                </tr> 
                <% }%>
            </table>
        </div>
    </body>
</html>
