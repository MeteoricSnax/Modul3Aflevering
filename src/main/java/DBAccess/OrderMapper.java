package DBAccess;

import FunctionLayer.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderMapper {
    
    public static void createOrder( Order order ) throws ClassNotFoundException, SQLException {
        
        
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO useradmin.orders VALUES (NULL, ?, ?, ?, ?, false)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, order.getUserId() );
            ps.setInt( 2, order.getLength() );
            ps.setInt( 3, order.getDepth() );
            ps.setInt( 4, order.getHeight() );


            ps.executeUpdate();

        }
        catch( SQLException | ClassNotFoundException ex ){
            throw new SQLException();
        }
    }
    
    public boolean deleteOrder(Order order) throws ClassNotFoundException{
        try
        {
            Connection con = Connector.connection();
            String SQL = "DELETE FROM useradmin.orders WHERE orderid = ?";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );

            ps.setInt(1, order.getOrderId());  
            ps.executeUpdate();

            return true;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return false;
    }
    public Order getOrder(int id) throws ClassNotFoundException{
        try
        {
            Connection con = Connector.connection();

            String SQL = "SELECT * from useradmin.orders where orderid = ?";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt(1, id);
            ResultSet resultset = ps.executeQuery();
            
            while (resultset.next())
            {
                int orderid = resultset.getInt("orderid");
                int userid = resultset.getInt("userid");
                int length  = resultset.getInt("length");
                int depth = resultset.getInt("depth");
                int height = resultset.getInt("height");
                boolean delivered = resultset.getBoolean("delivered");

                return new Order(orderid, userid, length, depth, height, delivered);
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return null;
    }
    
    public static ArrayList<Order> getAllOrders() throws ClassNotFoundException {
        ArrayList<Order> orders = new ArrayList();
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * from useradmin.orders";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ResultSet resultset = ps.executeQuery();
            
            while (resultset.next())
            {
                int orderid = resultset.getInt("orderid");
                int userid = resultset.getInt("userid");
                int length  = resultset.getInt("length");
                int depth = resultset.getInt("depth");
                int height = resultset.getInt("height");
                boolean delivered = resultset.getBoolean("delivered");

                Order o = new Order(orderid, userid, length, depth, height, delivered);

                orders.add(o);
            }
            
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return orders;
        
    } 
     
    public static ArrayList<Order> getAllCustomerOrders(int id) throws ClassNotFoundException {
        ArrayList<Order> orders = new ArrayList();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * from useradmin.orders where userid = ?";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);

            ResultSet resultset = ps.executeQuery();

            while (resultset.next()) {
                int orderid = resultset.getInt("orderid");
                int userid = resultset.getInt("userid");
                int length = resultset.getInt("length");
                int depth = resultset.getInt("depth");
                int height = resultset.getInt("height");
                boolean delivered = resultset.getBoolean("delivered");

                Order o = new Order(orderid, userid, length, depth, height, delivered);

                orders.add(o);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orders;

    }
    public static void sendOrder(int id) throws ClassNotFoundException{
        try
        {
            Connection con = Connector.connection();
            String SQL = "update useradmin.orders set delivered = true where orderid = ?";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );

            ps.setInt(1, id);  
            ps.executeUpdate();

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
