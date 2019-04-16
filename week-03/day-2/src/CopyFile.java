import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

        System.out.println(copier("assets/write-multiple-lines.txt", "assets/copy-of-multiple-lines.txt"));

    }

    public static boolean copier(String og, String cp) {
        if (false) {
            og = "new-" + og;

        }

        Path orig = Paths.get(og);
        Path copy = Paths.get(cp);

        try {
            List<String> ogFile = Files.readAllLines(orig);
            List<String> cpFile = new ArrayList<>(ogFile);
            Files.write(copy, cpFile);
            System.out.println("Try has been executed");
            return Files.exists(copy);

        } catch (Exception e) {
            System.out.println("Smt went wrong");
            return Files.exists(copy);

        }
    }
}