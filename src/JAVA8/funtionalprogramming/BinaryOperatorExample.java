package JAVA8.funtionalprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/**
 * takes two attribute return a single value
 * extends BiFunction
 * <p>
 * both parameter and return type should be same
 * <p>
 * IntBinaryOperator,LongBinaryOperator,DoubleBinaryOperator
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        //sum of two number
        BinaryOperator<Integer> binaryOperator1 = Integer::sum;
        System.out.println(binaryOperator1.apply(2, 6));

        System.out.println("----------------");
        Comparator<Integer> comparator = Integer::compareTo;
        //max of numbers
        BinaryOperator<Integer> binaryOperator2 = BinaryOperator.maxBy(comparator);
        System.out.println(binaryOperator2.apply(3, 9));
        //min of numbers
        BinaryOperator<Integer> binaryOperator3 = BinaryOperator.minBy(comparator);
        System.out.println(binaryOperator3.apply(3, 9));

        System.out.println("----------------");
        //IntBinaryOperator
        IntBinaryOperator intBinaryOperator = (x, y) -> x * y;
        System.out.println(intBinaryOperator.applyAsInt(2, 5));

        System.out.println("----------------");
        //LongBinaryOperator
        LongBinaryOperator longBinaryOperator = (x, y) -> x * y;
        System.out.println(longBinaryOperator.applyAsLong(2L, 5L));

        System.out.println("----------------");
        //DoubleBinaryOperator
        DoubleBinaryOperator doubleBinaryOperator = (x, y) -> x * y;
        System.out.println(doubleBinaryOperator.applyAsDouble(2.3, 5.5));
    }
}
