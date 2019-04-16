import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),

        reader(true);


    }

    public static void reader(boolean a) {
        if (a) {
            Path filePath = Paths.get("assets/my-file.txt");
            List<String> parseStr = new ArrayList<>();
            parseStr.add("Hello");
            parseStr.add("There");
            parseStr.add("General Kenobi!");
            try {
                Files.write(filePath, parseStr);
            } catch (Exception e) {
                System.out.println("Opps...");
            }

        }

        try {
            Path filePath = Paths.get("assets/my-file.txt");
            List<String> readFile = Files.readAllLines(filePath);
            for (String line : readFile) {
                System.out.println(line);
            }
            System.out.println("\n" +"Done!");
        } catch (Exception e) {
            System.out.println("It seems that the file does not exist");
        }
    }
}