package JAVA13;

/*
Text Blocks starts and end with """ """ and keeps the format as it is provided
 */
public class TextBlockExample {
    public static void main(String[] args) {
        var string1 = """
                Hello World
                Using
                text blocks!
                """;
        System.out.println("string1 = " + string1);

        var jsonFormat = """
                {
                "employee":"MIKE",
                "employeeId":10001,
                "employeType":"FT"
                }
                """;
        System.out.println("jsonFormat = " + jsonFormat);
    }
}
