import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Decropted {

    public static void main(String [] args) {

        checker();

    }

    public static void checker() {

        try {
            Path filePath = Paths.get("assets/doubled.txt");
            List<String> file = Files.readAllLines(filePath);
            List<String> fileNew = new ArrayList<>();


            for (int j = 0; j <file.size(); j++) {
                String newStr = "";
                for (int i = 0; i < file.get(j).length(); i+=2) {
                    newStr  += file.get(j).substring(i,i+1);
                }
                fileNew.add(j,newStr);
            }

            System.out.println(fileNew);
            Path decriptedPath = Paths.get("assets/decripted.txt");

            Files.write(decriptedPath,fileNew);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
