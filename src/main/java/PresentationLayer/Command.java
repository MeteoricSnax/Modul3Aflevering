package PresentationLayer;

import FunctionLayer.LoginSampleException;
import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "logout", new LogOut() );
        commands.put( "register", new Register() );
        commands.put( "help", new Help() );
        commands.put( "orderBlocks", new OrderBlocks() );
        commands.put( "customerpage", new Customerpage() );
        commands.put( "shoppingcart", new Shoppingcart() );
        commands.put( "productv2", new Productv2() ); 
        commands.put( "employeepage", new Employeepage() );
        commands.put( "vieworders", new ViewOrders());
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }
    

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws LoginSampleException, SQLException, ClassNotFoundException;

}
