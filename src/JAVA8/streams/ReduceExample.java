package JAVA8.streams;

import JAVA8.bean.Instructor;
import JAVA8.bean.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * reduce takes value and store it for repetative use
 * <p>
 * reduce(identy,BinaryOperator)-->idententy here is initial value to hold
 * reduce(BinaryOperator)-->returns Optional
 * <p>
 * max()
 */
public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        //0+1=1         //6+4=10
        //1+2=3         //10+5=15
        //3+3=6
        int listSum = integerList.stream().reduce(0, Integer::sum);
        System.out.println("-------------");
        System.out.println(listSum);

        //1*1=1         //12*4=48
        //2*2=4         //48*5=120
        //4*3=12
        int listProduct = integerList.stream().reduce(1, (x, y) -> x * y);
        System.out.println("-------------");
        System.out.println(listProduct);


        Optional<Integer> listSum1 = integerList.stream().reduce(Integer::sum);
        System.out.println("-------------");
        if (listSum1.isPresent())
            System.out.println(listSum1.get());


        System.out.println("-------------");
        //print instructer who has higher year of Exp
        Optional<Instructor> result = Instructors.getAll().stream().reduce((instructor, instructor2) -> {
            return instructor.getYearOfExp() > instructor2.getYearOfExp() ? instructor : instructor2;
        });
        result.ifPresent(System.out::println);

        System.out.println("-------------");
        //max()
        Optional<Integer> result1 = integerList.stream().max(Integer::compareTo);
        result1.ifPresent(System.out::println);
        //other approches
        Optional<Integer> result2 = integerList.stream().reduce((a, b) -> a > b ? a : b);
        result2.ifPresent(System.out::println);
        //other approches
        Optional<Integer> result3 = integerList.stream().reduce(Integer::max);
        result3.ifPresent(System.out::println);

        System.out.println("-------------");
        //max()
        Optional<Integer> result4 = integerList.stream().min(Integer::compareTo);
        result4.ifPresent(System.out::println);
        //other approches
        Optional<Integer> result5 = integerList.stream().reduce((a, b) -> a < b ? a : b);
        result5.ifPresent(System.out::println);
        //other approches
        Optional<Integer> result6 = integerList.stream().reduce(Integer::min);
        result6.ifPresent(System.out::println);

    }
}
