package JAVA11;
/**
 * String new method
 */
public class StringNewExample {
    public static void main(String[] args) {
        System.out.println("--------------------");
        //check if string contains white space or empty
        System.out.println(" ".isBlank());
        //remove white space from both side
        //Note will not replace white space in between
        System.out.println(" L R ".strip());
        //remover white space from left
        System.out.println(" L R ".stripLeading());
        //remover white space from right
        System.out.println(" L R ".stripTrailing());
        //split a string into multiple lines of stream
        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);
    }
}
