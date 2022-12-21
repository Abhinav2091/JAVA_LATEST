package defaultsandstatics;


public interface DefaultAndStaticExampleInterface {
    //abstract method
    public int sum(int num1, int num2);

    public int divide(int num1, int num2);

    //default method
    default int sub(int num1, int num2) {
        return num1 - num2;
    }

    //static method
    static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}
