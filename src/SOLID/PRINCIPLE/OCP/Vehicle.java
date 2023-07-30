package SOLID.PRINCIPLE.OCP;

/**
 * we should not write all vehicle details here
 * eg : write different method for different type of Vehicle
 * car,truck,bike etc instead chile class should override it and write their own implementation
 *
 * hence it is open to enhancement but no modification is done in parent
 */
public class Vehicle {
    public String VehicleDetail()
    {
        System.out.println("this is parent class.");
        return "Parent Vehicle details";
    }
}
