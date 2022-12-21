package defaultsandstatics;

public interface InterfaceC {
    default void displayC() {
        System.out.println("InterfaceC.displayC");
    }
}
