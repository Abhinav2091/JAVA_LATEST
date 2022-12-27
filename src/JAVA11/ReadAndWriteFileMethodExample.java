package JAVA11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * in java 11 we have some read and write method to read and write files
 */
public class ReadAndWriteFileMethodExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./src/JAVA11/resources/SampleFile.txt");
        var fileContent = Files.readString(path);
        System.out.println(fileContent);
        var newFileContent = fileContent.replace(".", ";");
        Path path1 = Paths.get("./src/JAVA11/resources/SampleFile_write.txt");
        Files.writeString(path1, newFileContent);
    }
}
