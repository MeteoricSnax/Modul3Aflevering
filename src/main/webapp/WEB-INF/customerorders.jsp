<%-- 
    Document   : customerOrders
    Created on : Mar 27, 2018, 11:25:05 PM
    Author     : Snax
--%>
<%@page import="FunctionLayer.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Order"%>
<%@page import="DBAccess.OrderMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@include file="../includes/topmenu.jsp" %>
        
        
        <h1>All your placed orders</h1>
        <p>Below you can see all orders your orders<br> 
           You can also change the delivery status.
        </p>
        <%User user = (User) session.getAttribute("user");%> 
        <%OrderMapper dm = new OrderMapper(); %>
        <% ArrayList<Order> orders = dm.getAllCustomerOrders(user.getId()); %>
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
                for(Order o : orders)
                { %>
                    <tr>
                    <td> <%= o.getOrderId() %> </td>  
                    <td> <%= o.getUserId() %> </td>  
                    <td> <%= o.getLength() %> </td>
                    <td> <%= o.getDepth() %> </td>  
                    <td> <%= o.getHeight() %> </td>  
                    <td> <% if(o.isDelivered() == true){ %> in transit <%} else{ %> not in transit yet <% } %></td>                                    
                </tr> 
                <% } %>
            </table>
        </div>
        
        
    </body>
</html>
