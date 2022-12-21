package JAVA8.funtionalprogramming;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

/**
 * it takes single parameter and return same type
 * it extends from Function
 * IntUnaryOperator,LongUnaryOperator,DoubleUnaryOperator
 */
public class UnaryOperatorExample {
    public static void main(String[] args) {
        //divide the no by 10
        UnaryOperator<Integer> unaryOperator1 = x -> x / 10;
        System.out.println(unaryOperator1.apply(100));

        System.out.println("----------------");
        //IntUnaryOperator takes only int has applyAsInt
        IntUnaryOperator intUnaryOperator1 = x -> x * 10;
        System.out.println(intUnaryOperator1.applyAsInt(5));

        System.out.println("----------------");
        //LongUnaryOperator takes only int has applyAsInt
        LongUnaryOperator longUnaryOperator = x -> x * 10L;
        System.out.println(longUnaryOperator.applyAsLong(5L));

        System.out.println("----------------");
        //DoubleUnaryOperator takes only int has applyAsInt
        DoubleUnaryOperator doubleUnaryOperator = x -> x * 10;
        System.out.println(doubleUnaryOperator.applyAsDouble(5));


    }
}
