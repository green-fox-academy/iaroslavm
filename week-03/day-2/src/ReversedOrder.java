import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String [] args) {

        reverserAgain();

    }

    public static void reverserAgain() {
        try {
            Path filePath = Paths.get("assets/reversedOrder");
            List<String> file = Files.readAllLines(filePath);
            List<String> fileFixed = new ArrayList<>();
            int index = 0;

            for (int i = file.size() - 1 ; i >= 0; i--) {
                fileFixed.add(index,file.get(i));
                index++;
            }
            Path fixedPath = Paths.get("assets/fixedOrder.txt");
            Files.write(fixedPath, fileFixed);
        } catch (IOException e) {
            System.out.println("Hmmm, there is not file, check the trace: \n" );
            e.printStackTrace();

        }
    }

}
