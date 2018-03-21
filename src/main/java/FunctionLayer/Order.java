package FunctionLayer;

public class Order {
    private int userId;
    private int orderId;
    private int block1;
    private int block2;
    private int block4;
    
    public Order (int userId, int orderId, int block1, int block2, int block4){
        this.userId = userId;
        this.orderId = orderId;
        this.block1 = block1;
        this.block2 = block2;
        this.block4 = block4;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setBlock1(int block1) {
        this.block1 = block1;
    }

    public void setBlock2(int block2) {
        this.block2 = block2;
    }

    public void setBlock4(int block4) {
        this.block4 = block4;
    }

    public int getUserId() {
        return userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getBlock1() {
        return block1;
    }

    public int getBlock2() {
        return block2;
    }

    public int getBlock4() {
        return block4;
    }
}
