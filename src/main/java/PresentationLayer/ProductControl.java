package PresentationLayer;


import DBAccess.OrderMapper;
import FunctionLayer.Order;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesper Outzen
 */
@WebServlet(name = "ProductControl", urlPatterns = {"/ProductControl"})
public class ProductControl extends HttpServlet {

    OrderMapper dm = new OrderMapper();

    public ProductControl()
    {
        
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        switch(request.getParameter("origin"))
        {
            case "create":
                {
                    int orderid = 0;
                    int userid = Integer.parseInt(request.getParameter("userid"));
                    int length = Integer.parseInt(request.getParameter("length"));
                    int depth = Integer.parseInt(request.getParameter("depth"));    
                    int height = Integer.parseInt(request.getParameter("height"));     
                    boolean delivered = false;
                    dm.createOrder(new Order(orderid, userid, length, depth, height, delivered));

                }
                break;                

            
//            case "delete":
//                {
//                    int orderid = Integer.parseInt(request.getParameter("orderid"));
//                                       
//                    if (dm.getOrder(orderid) != null)
//                    {
//                        dm.deleteOrder(orderid); 
//
//                        response.sendRedirect("orderdeleted.jsp"); 
//                    }                
//
//                }
//                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
