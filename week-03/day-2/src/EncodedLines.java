import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String [] args) {

        checker();

    }

    public static void checker() {

        try {
            Path filePath = Paths.get("assets/EncodedLines.txt");
            List<String> file = Files.readAllLines(filePath);
            List<String> fileNew = new ArrayList<>();


            for (int j = 0; j <file.size(); j++) {
                String newStr = "";
                for (int i = 0; i < file.get(j).length() - 1; i++) {
                    newStr  += file.get(j).substring(i+1,i+2);
                }
                fileNew.add(j,newStr);
            }

            System.out.println(fileNew);
            Path decriptedPath = Paths.get("assets/decriptedNew.txt");

            Files.write(decriptedPath,fileNew);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
