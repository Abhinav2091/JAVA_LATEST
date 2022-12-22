package JAVA10;
/**
 * var are limited to local variable only.
 */

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TypeInterferenceExample {
    //will not work
    //var age=26;
    public static void main(String[] args) {
        //string
       final  var name = "Abhinav";
        System.out.println("name = " + name);
        var dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        //long
        var longVal = 999999999999999L;
        System.out.println("longVal = " + longVal);

        //Map
        var hashMap = new HashMap<String, String>(3);
        hashMap.put("Abhinav", "Sharma");
        hashMap.put("Aju", "Singh");
        hashMap.put("Ram", "Rana");
        System.out.println("hashMap = " + hashMap);

        //Array
        var intArray = new int[]{1, 2, 3, 4, 5};
        System.out.println("Arrays.toString(intArray) = " + Arrays.toString(intArray));

        //list
        var listName = Arrays.asList("Abhi", "Aju", "Ram");
        System.out.println("listName = " + listName);

        //list of object
        var listObject = new ArrayList<>();
        listObject.add("Abhinav");
        listObject.add(true);
        listObject.add(1.00);
        System.out.println("listObject = " + listObject);

        System.out.println("---------------------");
        //reassigning values
        var result = 9d / 2d;
        System.out.println("result is double = " + result);
        result = 5;
        System.out.println("result is still double = " + result);

        System.out.println("---------------------");
        //var as argument
        var inputVal = "Hellow World";
        // if I put input val as 1 it will give compile time error
        displayMessage(inputVal);

    }


    public static void displayMessage(String inputVal) {
        System.out.println("inputVal = " + inputVal);
    }
}
