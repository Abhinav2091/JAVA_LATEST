package JAVA12;
/**
 * String new method
 */
public class StringNewExample {
    public static void main(String[] args) {
        //perform ny transformation on string
        //eg get sub string of 2 char
        var string="ABHINAV";
        var result=string.transform(s->s.substring(0,2));
        System.out.println(result);
    }
}
