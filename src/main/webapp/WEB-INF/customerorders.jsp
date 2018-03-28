
<%@page import="FunctionLayer.BlockList"%>
<%@page import="FunctionLayer.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.LogicFacade"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CustomerOrders</title>
    </head>
    <body>
        
        <%@include file="../includes/topmenu.jsp" %>
        
        
        <h1>All your placed orders</h1>
        <p>Below you can see all orders your orders<br> 
           You can also change the delivery status.
        </p>
        <%User user = (User) session.getAttribute("user");%> 
        <% ArrayList<Order> order = LogicFacade.getAllCustomerOrders(user.getId()); %>
        <div class="orderTable2">   
            <table class="table">
                <tr>
                    <th>Order ID</th>
                    <th>User ID</th>
                    <th>Block1</th>
                    <th>Block2</th>
                    <th>Block4</th>
                    <th>Delivered</th>
                </tr>
                
                 <%
                for(Order o : order)
                { %>
                    <tr>
                    <td> <%= o.getOrderId() %> </td>
                    <td> <%= o.getUserId() %> </td>
                    <td> <%= BlockList.getBlock1(o.getLength(), o.getDepth(), o.getHeight()) %> </td>
                    <td> <%= BlockList.getBlock2(o.getLength(), o.getDepth(), o.getHeight()) %> </td>
                    <td> <%= BlockList.getBlock4(o.getLength(), o.getDepth(), o.getHeight()) %> </td>
                    <td> <% if(o.isDelivered() == true){ %> in transit <%} else{ %> not in transit yet <% } %></td>
                </tr> 
                <% } %>
            </table>
        </div>
        
        
    </body>
</html>
