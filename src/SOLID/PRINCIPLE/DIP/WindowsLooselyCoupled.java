package SOLID.PRINCIPLE.DIP;

/**
 * here instead of passing it in constructor we can pass the object of class that implements that interface to make it loosely coupled
 */
public class WindowsLooselyCoupled {
    private final KeyboradImpl keyboard;
    private final  MouseImpl mouse;

    WindowsLooselyCoupled(KeyboradImpl keyboard,MouseImpl mouse)
    {
        this.keyboard=keyboard;
        this.mouse=mouse;
        System.out.println("L windows constructor."+keyboard+" "+mouse);
    }

}
