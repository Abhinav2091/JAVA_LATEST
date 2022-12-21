package defaultsandstatics;

public interface InterfaceA {
    default void displayA() {
        System.out.println("InterfaceA.displayA");
    }
}
