package SOLID.PRINCIPLE.LSP;

public class Rectangle extends Shape{
    private long length;
    private long width;

    public Rectangle(long length,long width)
    {
        this.length=length;
        this.width=width;
    }

    public long getArea()
    {
        return length*width;
    }
}
