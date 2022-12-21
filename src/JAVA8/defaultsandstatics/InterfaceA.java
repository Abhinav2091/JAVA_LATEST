package JAVA8.defaultsandstatics;

public interface InterfaceA {
    default void displayA() {
        System.out.println("InterfaceA.displayA");
    }
}
