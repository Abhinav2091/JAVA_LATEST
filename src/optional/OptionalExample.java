package optional;

import java.util.Optional;

/**
 * used to avoid null point exception at run time
 * <p>
 * optionalOf()-->doestn't take null values
 * optionalofNullable()-->return null value if not provided
 * Optional.empty()-->return an empty value
 * <p>
 * orElse(value)-->return value provided if no value is assigned
 * orElseGet(supplier)-->return Supplier provided if no value is assigned
 * orElseThrow(Exception)-->return the exception if value is not assigned
 * <p>
 * ifPresent(consumer)
 * isPresent()-->returns boolean
 */
public class OptionalExample {
    public static void main(String[] args) {
        //create a null point exception
        Integer[] testArray = new Integer[5];
        /*
        int number =testArray[3];
        System.out.println(number);
        */

        //Optional.Nullable return null
        testArray[1] = 1;
        Optional<Integer> optional = Optional.ofNullable(testArray[2]);
        //will not print anything if value is null to avoid null pointer exception
        optional.ifPresent(System.out::println);
        if (optional.isPresent())
            System.out.println(optional.get());

        //optionalOf
        //null -> will throw null pointer exception
        Optional<String> optionalString = Optional.of("Hello World");
        System.out.println("optionalString = " + optionalString.get());

        //return an empty value
        System.out.println(Optional.empty());

        System.out.println("------------------");


        int result = optional.orElse(-1);
        System.out.println("result -----orElse() = " + result);

        result = optional.orElseGet(() -> -2);
        System.out.println("result -----orElseGet() = " + result);

        try {
            result = optional.orElseThrow(NullPointerException::new);
            System.out.println("result -----orElseThrow() = " + result);
        } catch (NullPointerException ne) {
            ne.printStackTrace();
        }

    }
}
