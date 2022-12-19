package streams;

import bean.Instructor;
import bean.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * partitoned a stream on the basis of provided predicate
 * <p>
 * partitioningBy(predicate)  returns Map<Boolean,List<T>>
 * partitioningBy(predicate,downstream)  returns Map<Boolean,List<T>>
 */
public class PartitioningByExample {
    public static void main(String[] args) {
        //partition instrusture who have exp more than 5 and less than that
        Predicate<Instructor> expPredicate = instructor -> instructor.getYearOfExp() > 5;
        Map<Boolean, List<Instructor>> resultMap = Instructors.getAll().stream().collect(Collectors.partitioningBy(expPredicate));

        resultMap.forEach((key, value) -> {
            System.out.println("key:" + key + " value:" + value);
        });

        System.out.println("----------------------");
        //partitioningBy(predicate)
        // partitioningBy(predicate,downstream)
        //do same above partition but returns a set
        Map<Boolean, Set<Instructor>> resultMap1 = Instructors.getAll().stream().collect(Collectors.partitioningBy(expPredicate, Collectors.toSet()));

        resultMap1.forEach((key, value) -> {
            System.out.println("key:" + key + " value:" + value);
        });
    }
}
