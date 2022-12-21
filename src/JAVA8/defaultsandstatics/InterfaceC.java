package JAVA8.defaultsandstatics;

public interface InterfaceC {
    default void displayC() {
        System.out.println("InterfaceC.displayC");
    }
}
