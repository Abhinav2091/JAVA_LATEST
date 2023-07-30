package SOLID.PRINCIPLE.LSP;

public class MainClass {
    public static void main(String ar[])
    {
        Shape shape = new Rectangle(10,20);
        Shape shape1 = new Square(30);
        System.out.println(shape.getArea());
        System.out.println(shape1.getArea());
    }
}
