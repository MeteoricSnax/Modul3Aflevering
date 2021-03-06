/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesper Outzen
 */
public class SendOrder extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException, ClassNotFoundException {
        
        int id = Integer.parseInt(request.getParameter("orderid"));
        
        LogicFacade.sendOrder(id);
        
        
        return "vieworders";
    }
    
}
