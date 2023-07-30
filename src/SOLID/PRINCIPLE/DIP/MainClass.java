package SOLID.PRINCIPLE.DIP;

public class MainClass {
    public static void main(String ar[])
    {
        KeyboradImpl keyboard = new Keyboard();
        MouseImpl mouse  = new Mouse();
        new WindowsLooselyCoupled(keyboard,mouse);
    }
}
