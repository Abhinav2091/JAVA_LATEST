package streams;

import bean.Instructor;
import bean.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * filter(Predicate)
 * <p>
 * this operation is lazy--> does not perform any filtering but instead create a new stream that, when traversed containes
 * the element of the initial stream that matches the predicate
 */
public class FilterExample {

    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();

        //return instructor sorted by there name and have more than 5 year of Exp
        List<Instructor> instructorList1 = instructorList.stream().filter(instructor -> instructor.getYearOfExp() > 5)
                .sorted(Comparator.comparing(Instructor::getName)).collect(Collectors.toList());
        System.out.println("---------------------");
        instructorList1.forEach(System.out::println);

        System.out.println("---------------------");
    }
}
