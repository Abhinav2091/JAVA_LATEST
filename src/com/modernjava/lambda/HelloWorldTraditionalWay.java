package com.modernjava.lambda;

public class HelloWorldTraditionalWay implements HelloWorldInterface {

    @Override
    public String sayHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        HelloWorldTraditionalWay helloWorldTraditionalWay = new HelloWorldTraditionalWay();
        System.out.println(helloWorldTraditionalWay.sayHelloWorld());
    }
}
