import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExTwelweStarWars {

  public static void getResult(){

  }
  public static void readFile(){
    Path filePath = Paths.get("swcharacters.csv");
    try {
      List<String> logFile = Files.readAllLines(filePath);
      List<String> newList = new ArrayList<>();

      return newList;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }
}
