package JAVA16;

/**
 * instance of can also declare the variable as well
 */
public class InstanceOfExample {
    record RecordBean(String name, int age, long salary) {
    }

    public static void main(String[] args) {
        Object recordBean = new RecordBean("Abhinav", 29, 1000L);
        if (recordBean instanceof RecordBean recordBeanVariableName) {
            System.out.println(recordBeanVariableName);
        }
    }


}
