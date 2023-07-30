package SOLID.PRINCIPLE.SRP;

/**
 * Here single class is performing all the activity which is not following
 * Single class Responsibility
 */
public class OLDStudent {
    public void printDetails()
    {
        System.out.println("Student Details.");
    }
    public void addStudent()
    {
        System.out.println("add Student.");
    }
    public void getResult()
    {
        System.out.println("Get Result.");
    }
}
