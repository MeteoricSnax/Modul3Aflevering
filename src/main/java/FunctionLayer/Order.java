package FunctionLayer;

public class Order {
    private int userId;
    private int orderId;
    private int length;
    private int depth;
    private int height;
    private boolean delivered;

    public Order(int orderId, int userId, int length, int depth, int height, boolean delivered) {
        this.userId = userId;
        this.orderId = orderId;
        this.length = length;
        this.depth = depth;
        this.height = height;
        this.delivered = delivered;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
 
    
    
}