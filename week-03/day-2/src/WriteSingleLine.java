import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        writer("Iaroslav Miller", false);

    }

    public static void writer(String a, boolean bull) {

        try {
            List<String> stringToWrite = new ArrayList<>();
            stringToWrite.add(a);
            Path filePath = Paths.get("assets/my-file.txt");
            Files.write(filePath,stringToWrite);
            System.out.println("Try has been executed");

        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}