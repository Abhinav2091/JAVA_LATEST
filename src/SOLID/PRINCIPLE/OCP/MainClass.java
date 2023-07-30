package SOLID.PRINCIPLE.OCP;

public class MainClass {
    public static void main(String ar[])
    {
        Vehicle v = new CarDetails();
        System.out.println(v.VehicleDetail());
        Vehicle v1 = new Truck();
        System.out.println(v1.VehicleDetail());
        Vehicle v3 = new Vehicle();
        System.out.println(v3.VehicleDetail());
    }
}
