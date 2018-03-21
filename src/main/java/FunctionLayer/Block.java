/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import DBAccess.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Block {

    public void blockCalc(int length, int depth) throws LoginSampleException {
        int block1Length = 0;
        int block2Length = 0;
        int block4Length = 0;
        int block1Depth = 0;
        int block2Depth = 0;
        int block4Depth = 0;
        
        
//        calcs amounts of 4 by 2 blocks to be used
        block4Length = length / 4;
//        calcs amount of 1 by 2 and 2 by 2
        switch (length % 4) {
            case 3: {
                block2Length = 1;
                block1Length = 1;
            }

            case 2: {
                block2Length = 1;
            }

            case 1: {
                block1Length = 1;
            }
        }
//        calcs amounts of 4 by 2 blocks to be used
        block4Depth = (depth - 4) / 4;
//        calcs amount of 1 by 2 and 2 by 2
        switch ((depth - 4) % 4) {
            case 3: {
                block2Depth = 1;
                block1Depth = 1;
            }

            case 2: {
                block2Depth = 1;
            }

            case 1: {
                block1Depth = 1;
            }
        }
        
        int block4Total = block4Depth + block4Length;
        int block2Total = block2Depth + block2Length;
        int block1Total = block1Depth + block1Length;
        
        
        
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders VALUES (NULL, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, 1);
            ps.setInt( 2, block1Total );
            ps.setInt( 3, block2Total );
            ps.setInt( 4, block4Total );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
        
    }

}
