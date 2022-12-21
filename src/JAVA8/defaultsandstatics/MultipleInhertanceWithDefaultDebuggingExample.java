package JAVA8.defaultsandstatics;

/**
 * if we implement Interface A and D here both have same method, so it will give us compilation error
 * NOTE:the only way to resolve it is to override it in this particular class
 */
public class MultipleInhertanceWithDefaultDebuggingExample implements InterfaceD, InterfaceA {

    @Override
    public void displayA() {
        System.out.println("MultipleInhertanceWithDefaultDebuggingExample.displayA");
    }
}
