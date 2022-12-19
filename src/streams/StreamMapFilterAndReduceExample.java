package streams;

import bean.Instructor;
import bean.Instructors;

import java.util.List;

public class StreamMapFilterAndReduceExample {
    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();

        //total year of Exp of all instructor who is teaching online exp
        int result = instructorList.stream().filter(Instructor::isOnlineCourses).map(Instructor::getYearOfExp).reduce(0, Integer::sum);

        System.out.println(result);

    }
}
