package JAVA9.improvements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * before java 9 we have tlo declare variable inside resources
 * where as after java 9 we don't required it
 */
public class TryWithResourcesExample {
    public static void main(String[] args) throws IOException {
        Reader inputString = new StringReader("Hello World in java 8.");
        //old way
        BufferedReader bf = new BufferedReader(inputString);
        try (BufferedReader bf1 = bf) {
            System.out.println("bf1.readLine() = " + bf1.readLine());
        }


        Reader inputString1 = new StringReader("Hello World in java 9.");
        BufferedReader bf2 = new BufferedReader(inputString1);
        System.out.println("--------------------");
        //after java 8
        try (bf2) {
            System.out.println("bf2.readLine() = " + bf2.readLine());
        }
    }
}
