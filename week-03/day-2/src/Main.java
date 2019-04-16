import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("assets/test.html");

        try {
            List<String> parse = Files.readAllLines(path); // we created a new List and each element is line from assets/test.html
            for (String line : parse) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("No file found");
            e.printStackTrace();
        } finally {
            System.out.println("Program has finished");

            someHeights();
        }
    }

    public static void someHeights() {
        Path file = Paths.get("assets/data.txt");
        try {
            List<String> data = Files.readAllLines(file);
            int sum = 0;
            for (String datas : data) {
                String [] strData = datas.split(";");
                System.out.println(Arrays.toString(strData));
                strData[1] = strData[1].trim();
                strData[2] = strData[2].trim(); // trim is used to
                sum += Integer.parseInt(strData[1]);
            }
            Path newPath = Paths.get("assets/new.txt");
            List<String> newList = new ArrayList<>();
            newList.add(Integer.toString(sum));
            Files.write(newPath, newList);
            System.out.println(sum);
        } catch (IOException e) {
            System.out.println("Some problems");
        }


    }
}
