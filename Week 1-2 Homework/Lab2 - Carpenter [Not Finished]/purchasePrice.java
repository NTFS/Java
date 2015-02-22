
/**
 * Lab2
 * 
 * @author  
 * @version (1-26-15)
 */
public class purchasePrice
{
    // instance variables - replace the example below with your own
    private int minChargeDesk = 200;
    private int length;
    private int width;
    private int totalCost;
    private int orderNumber;
    private String customerName;
    private 
    /**
     * Constructor for objects of class main
     */
    public main()
    {
        length = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int checkSurfaceCost()
    {
        int output;
        output = length * width;
        if(output > 750)
        {
            totalCost = totalCost + 50;
        }
    }
    public void printCost()
    {
        System.out.println("Order #: " + orderNumber + "\n" + "Customer: " + customerName);
    }
}
