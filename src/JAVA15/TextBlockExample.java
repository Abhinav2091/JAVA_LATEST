package JAVA15;

/**
Text Blocks starts and end with """ """ and keeps the format as it is provided
whatever is inside text b;lock will get print as it is
 */
public class TextBlockExample {
    public static void main(String[] args) {
        var string1 = """
                "Hello World"
                'Using'
                text blocks!
                """;
        System.out.println("string1 = " + string1);

        var jsonFormat = """
                {
                "employee":"%s",
                "employeeId":10001,
                "employeType":"FT"
                }
                """.formatted("Abhinav");
        System.out.println("jsonFormat = " + jsonFormat);
    }
}
