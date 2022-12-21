package defaultsandstatics;

public interface InterfaceD {
    default void displayA() {
        System.out.println("InterfaceD.displayA");
    }
}
