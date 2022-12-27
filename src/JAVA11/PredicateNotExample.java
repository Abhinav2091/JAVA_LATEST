package JAVA11;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Predicate.not()
 * similar to negate method but if we do predicate on in build method it will not have negate
 * so for that we can use it
 */
public class PredicateNotExample {
    public static void main(String[] args) {
        var numList = Arrays.asList(2, 44, 5, 6, 3, 1, 5, 7);
        //print odd number
        numList.stream().filter(Predicate.not(PredicateNotExample::isEven)).forEach(System.out::println);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
