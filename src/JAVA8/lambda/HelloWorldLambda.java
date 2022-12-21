package JAVA8.lambda;

public class HelloWorldLambda {

    public static void main(String[] args) {

        HelloWorldInterface helloWorldInterface = () -> "Hello World using lambda";

        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
