import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedStuff {

    public static void main(String[] args) {

        reverser();

    }

    public static void reverser() {

        try {
            Path filePath = Paths.get("assets/reversedLines.txt");
            List<String> file = Files.readAllLines(filePath);
            List<String> fileFixed = new ArrayList<>();
            int index = 0;

            for (String line : file) {
                StringBuilder sb = new StringBuilder(line);
                String str = sb.reverse().toString();
                fileFixed.add(index,str);
                index++;
            }
            Path fixedPath = Paths.get("assets/fixedLines.txt");
            Files.write(fixedPath, fileFixed);
        } catch (IOException e) {
            System.out.println("Hmmm, there is not file, check the trace: \n" );
            e.printStackTrace();

        }
    }
}
