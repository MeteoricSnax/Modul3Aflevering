/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import PresentationLayer.Command;
import PresentationLayer.Command;
import PresentationLayer.Command;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jesper Outzen
 */
public class Help extends Command {
    
    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException {
        return "help";
    }
    
}
