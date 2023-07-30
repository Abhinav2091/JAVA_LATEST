package SOLID.PRINCIPLE.ISP;

/**
 * this interface is converting int double and long
 * where as it is not following Interface segregate principle (ISP) this interface should be break down into individual interface for that.
 *
 */
public interface Conversion {
    public void intToDouble();
    public void intToChar();
    public void charToString();
}
