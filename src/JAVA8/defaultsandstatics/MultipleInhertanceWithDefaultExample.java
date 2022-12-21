package JAVA8.defaultsandstatics;

public class MultipleInhertanceWithDefaultExample implements InterfaceA, InterfaceB, InterfaceC {
    public static void main(String[] args) {
        MultipleInhertanceWithDefaultExample mih = new MultipleInhertanceWithDefaultExample();
        //if interface B extends interface A then here displayB of interface B will be called
        mih.displayA();
        //if we provide implemntation in this class it will cal that  first
        mih.displayB();
        mih.displayC();
    }

    public void displayB() {
        System.out.println("MultipleInhertanceWithDefaultExample.displayB");
    }
}
