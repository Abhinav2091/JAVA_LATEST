package JAVA8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * limit(long n)->return stream of that limit
 * <p>
 * skip(long n)->return stream after skipping the n
 */
public class LimitAndSkipExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> result1=integerList.stream().limit(3).collect(Collectors.toList());
        System.out.println(result1);
        List<Integer> result2=integerList.stream().skip(3).collect(Collectors.toList());
        System.out.println(result2);
    }
}
