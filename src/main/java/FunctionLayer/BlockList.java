
package FunctionLayer;


public class BlockList {
    
    public int getBlock4(int length, int depth, int heigth) {
        int block4 = (length / 4) + ((depth - 4) / 4) * heigth;
        return block4;
    }

    public int getBlock2(int length, int depth, int heigth) {
        int temp1 = (length % 4) + ((depth - 4) % 4);
        int temp2 = (depth - 4) % 4;
        int block2 = 0;
        if (temp1 == 2 || temp1 == 3)
            block2 = block2 + 1;
        if (temp2 == 2 || temp2 == 3)
            block2 = block2 + 1;
       
        return block2;
    }

    public int getBlock1(int length, int depth, int heigth) {
        int temp1 = (length % 4) + ((depth - 4) % 4);
        int temp2 = (depth - 4) % 4;
        int block1 = 0;
        if (temp1 == 1 || temp1 == 3)
            block1 = block1 + 1;
        if (temp2 == 1 || temp2 == 3)
            block1 = block1 + 1;
       
        return block1;
    }
    
}
