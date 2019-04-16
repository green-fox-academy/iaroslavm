import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
        System.out.println("Line count is " +reader(false));


    }

    public static int reader(boolean a) {
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

//        int lineCount = 0;
        try {
//            int lineCount = 0;
            Path filePath = Paths.get("assets/my-file.txt");
            List<String> readFile = Files.readAllLines(filePath);
            for (String line : readFile) {
                System.out.println(line);
//                lineCount++;
            }

            System.out.println("\n" +"Done!");
            return readFile.size();
        } catch (Exception e) {
            System.out.println("It seems that the file does not exist");
            return 0;
        }
    }
}