package funtionalprogramming;
/**
 * cannot have same name as local variable inside lambda
 * <p>
 * Effectively final
 * cannot update local variable inside lambda even if it not final
 *we cannot even use it if it is getting updated after lambda
 *
 * static scope or class level variable can be used and modified inside lambda
 */

import bean.Instructor;
import bean.Instructors;

import java.util.List;
import java.util.function.IntConsumer;

public class VariableScopeExample {
    static  int x=0;

    public static void main(String[] args) {
        //local variable
        int a = 10;
        //ERROR 1
        //IntConsumer intConsumer =x->x+a++;

        int k = 0;
        List<Instructor> instructorList = Instructors.getAll();
        instructorList.forEach(instructor -> {
            //ERROR 2
            //   System.out.println(k+++"  "+instructor);

            //ERROR 3
             // System.out.println(k+"  "+instructor);

            System.out.println(x++);
        });
        //ERROR 3 will be gone if we comment this
        k=7;

    }
}
