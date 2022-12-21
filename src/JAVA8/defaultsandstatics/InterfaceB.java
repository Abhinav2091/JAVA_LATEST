package JAVA8.defaultsandstatics;

public interface InterfaceB extends InterfaceA {
    default void displayB() {
        System.out.println("InterfaceB.displayB");
    }
    default void displayA() {
        System.out.println("InterfaceB.displayA");
    }
}
