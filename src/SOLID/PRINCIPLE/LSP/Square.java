package SOLID.PRINCIPLE.LSP;

public class Square extends Shape{
    private long size;
    public Square(long size)
    {
        this.size=size;
    }
    public long getArea()
    {
        return size*size;
    }
}
