/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesper Outzen
 */
public class Productv2 extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, ClassNotFoundException, SQLException {
        
                    int orderid = 0;
                    int userid = Integer.parseInt(request.getParameter("userid"));
                    int length = Integer.parseInt(request.getParameter("length"));
                    int depth = Integer.parseInt(request.getParameter("depth"));    
                    int height = Integer.parseInt(request.getParameter("height"));     
                    boolean delivered = false;
                    LogicFacade.createOrder(new Order(orderid, userid, length, depth, height, delivered));
                    

            return "orderBlocks";    
    }
   
    
}
