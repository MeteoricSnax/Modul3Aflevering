package DBAccess;

import FunctionLayer.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderMapper {

    public static void createOrder( Order order ) throws ClassNotFoundException, SQLException {
        
        
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders VALUES (NULL, ?, ?, ?, ?, false)";
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
            String SQL = "DELETE FROM orders WHERE orderid = ?";
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
    
}
