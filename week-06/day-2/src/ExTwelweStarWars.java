import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class ExTwelweStarWars {

  public static void getResult() {

    System.out.println("Max weight belongs to "+  checkWeight(readFile()));
    System.out.println("Average male height is  "+  checkMaleHeight(readFile()));

  }

  public static List<SWCharacter> readFile() {
    Path filePath = Paths.get("swcharacters.csv");
    List<SWCharacter> swPeople = new ArrayList<>();
    try {
      List<String> logFile = Files.readAllLines(filePath);

      String[] features;
      for (int i = 1; i < logFile.size(); i++) {
        features = logFile.get(i).split(";");
        swPeople.add(new SWCharacter(features[0],
            features[1],
            features[2].replaceAll(",",""),
            features[3],
            features[4],
            features[5],
            features[6],
            features[7]
        ));
      }
      return swPeople;
    } catch (IOException e) {
      e.printStackTrace();
      return swPeople;
    }
  }

  public static String checkWeight(List<SWCharacter> heroes) {
    System.out.println(heroes.get(0).getMass());

    List<Map.Entry<String, Double>> sortedWeigthMap =
        heroes
            .stream()
            .filter(e -> !e.getMass().equals("n/a"))
            .filter(e -> !e.getMass().equals("none"))
            .filter(e -> !e.getMass().equals("unknown"))
            .collect(
                toMap(e -> e.getName(), e -> Double.parseDouble(e.getMass()), (e1, e2) -> e2,
                    LinkedHashMap::new))
            .entrySet()
            .stream()
            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .collect(Collectors.toList());

    return sortedWeigthMap.get(0).getKey();
  }

  public static double checkMaleHeight(List<SWCharacter> heroes){
    double meanHeight =
        heroes
            .stream()
            .filter(e -> !e.getMass().equals("n/a"))
            .filter(e -> !e.getMass().equals("none"))
            .filter(e -> !e.getMass().equals("unknown"))
            .filter(e -> e.getGender().toLowerCase().equals("male"))
            .map(h -> h.getHeight())
            .map(h -> Integer.parseInt(h))
            .mapToInt(h -> h)
            .average()
            .orElse(Double.NaN);
    return meanHeight;
  }
}
