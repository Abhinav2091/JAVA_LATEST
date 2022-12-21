package JAVA8.defaultsandstatics;

public class DefaultAndStaticExample implements DefaultAndStaticExampleInterface {
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        DefaultAndStaticExample defaultAndStaticExample = new DefaultAndStaticExample();
        System.out.println(defaultAndStaticExample.sum(1, 2));
        System.out.println("----------------------------");
        System.out.println(defaultAndStaticExample.divide(10, 2));
        System.out.println("----------------------------");
        System.out.println(defaultAndStaticExample.sub(4, 2));
        System.out.println("----------------------------");
        System.out.println(DefaultAndStaticExampleInterface.multiply(4, 2));
    }
}
