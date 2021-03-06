import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

        writer("assets/write-multiple-lines.txt","apple",5);

    }

    public static void writer(String strPath, String word, int number) {
        if (false) {
            strPath = "new-" + strPath;
        }

        try {
            List<String> stringToWrite = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                stringToWrite.add(word);
            }
            Path filePath = Paths.get(strPath);
            Files.write(filePath,stringToWrite);
            System.out.println("Try has been executed");

        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}