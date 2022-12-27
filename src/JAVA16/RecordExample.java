package JAVA16;

/**
 * to remove extra codes
 */
public class RecordExample {
    //create a record it will generate
    //public accessor method
    //constructor
    //equals and hash code method
    //to string method
    record RecordBean(String name, int age, long salary) {
        //can also have compact constructor
        //eg if want to check if name is null or not
        RecordBean {
            if (name == null)
                throw new IllegalArgumentException("Name is not valid");
        }
    }

    public static void main(String[] args) {

        //RecordBean recordBean = new RecordBean(null,29,896L);

        RecordBean recordBean = new RecordBean("Abhinav", 29, 896L);
        RecordBean recordBean1 = new RecordBean("Abhinav", 29, 896L);
        RecordBean recordBean2 = new RecordBean("Aju", 29, 896L);

        //will also generate hash code and equals method for us
        System.out.println(recordBean.equals(recordBean1));
        System.out.println(recordBean.equals(recordBean2));
        System.out.println(recordBean.name);
        System.out.println(recordBean);

    }
}
