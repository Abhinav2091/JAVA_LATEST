package SOLID.PRINCIPLE.DIP;

/**
 * we want to use keyboard and mouse class instance to work in our windows machine
 * but in this class all three of those are tightly coupled hence not following Dependency Inversion Principle
 */
public class Windows {
    public final Keyboard keyboard;
    public final Mouse mouse;

    public Windows(){
        keyboard=new Keyboard();
        mouse = new Mouse();
        System.out.println("windows constructor.");
    }
}
