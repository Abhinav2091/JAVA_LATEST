package JAVA9.factorymethod;

import java.util.*;

public class OFFactoryMethodExample {
    public static void main(String[] args) {
        //crete unmodifiable list /set / map before java 9
        List<String> nameList = Arrays.asList("Abhinav", "Abhi", "Ram");
        nameList = Collections.unmodifiableList(nameList);
        System.out.println("nameList = " + nameList);
        //if we try to modifiy it,it will throe error
        // nameList.add("Ajay");

        //after java 9
        List<String> nameList1 = List.of("Abhinav", "Abhi", "Ram");
        System.out.println("nameList1 = " + nameList1);
        //unsopported exception if we try to modified
        //nameList1.add("Ajay");
        //we cannot even sort it
        // nameList1.sort(Comparator.naturalOrder());

        //illelagel argument exception as we are trying to add duplicate in set
        //Set<String> nameSet = Set.of("Abhi","Abhi","Aju");

        //illelagel argument exception as we are trying to add duplicate key in map
        // Map<String,String> nameMap = Map.of("abhi","abhi","abhi","abhi");

    }
}
