package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static void createOrder(Order order) throws ClassNotFoundException, SQLException{
        OrderMapper.createOrder(order);
    }
    
    public static ArrayList<Order> getAllOrders() throws ClassNotFoundException{
        ArrayList<Order> orders = OrderMapper.getAllOrders();
        return orders;
    }
    public static ArrayList<Order> getAllCustomerOrders(int id) throws ClassNotFoundException{
        ArrayList<Order> orders = OrderMapper.getAllCustomerOrders(id);
        return orders;
    }

}
