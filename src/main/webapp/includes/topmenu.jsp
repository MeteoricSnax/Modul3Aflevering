<style>
    *{
        box-sizing: border-box;
    }
    body {
        margin: 0;
    }
    .topMenu{
        overflow: hidden;
        background-color: #555;
    }
    .topMenu a {
        float: left;
        display: block;
        color: #f1f1f1;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
    }
    .topMenu a:hover{
        background-color: #7a5f43;
        color: orange;
    }
</style>
<%if(session.getAttribute("id")== null)
{%>
<div class="topMenu">
    <a href="index.jsp" class="button">Home</a>
    <a href="FrontController?command=help"  class ="button">Help</a>
</div>
<%}else if(session.getAttribute("role").equals("employee")){%>
    <div class="topMenu">
    <a href="FrontController?command=employeepage" class="button">Home</a>
    <a href="FrontController?command=orderBlocks" class="button">Order</a>
    <a href="FrontController?command=vieworders" class="button">View Orders</a>
</div>
<%}else{%>
<div class="topMenu">
    <a href="FrontController?command=customerpage" class="button">Home</a>
    <a href="FrontController?command=orderBlocks" class="button">Order</a>
    <a href="FrontController?command=shoppingcart" class="button">Shopping cart</a>
</div>
<%}%>




