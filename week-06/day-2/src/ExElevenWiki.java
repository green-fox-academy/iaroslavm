import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class ExElevenWiki {
  public static Map<String, Long> checkWiki(){

    return sortList(countWords(readFile("text.txt")));
  }

  public static List<String> readFile(String filePathName){
    Path filePath = Paths.get(filePathName);
    try {
      List<String> logFile = Files.readAllLines(filePath);
      List<String> newList = new ArrayList<>();

      for (String each : logFile){
        each = each.replaceAll("[/()'.,;}}]", "");
        each = each.replaceAll("\\[(.*?)\\]", "");
        each = each.replaceAll("ˈ", "");
        newList.addAll(Arrays.asList(each.split(" ")));
      }
      return newList;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }
  public static Map<String, Long> countWords(List<String> strList){
    Map<String, Long> freqMap =
        strList
            .stream()
            .map(str -> str.replaceAll(", ",""))
            .map(str -> str.replaceAll("\"",""))
            .map(str -> str.toLowerCase())
            .filter(str -> !str.equals(""))
            .collect(Collectors.groupingBy(str -> str, Collectors.counting()));

    System.out.println(freqMap);
    return freqMap;
  }

  public static Map<String, Long> sortList(Map<String, Long> str){
    Map<String, Long> sortedMap =
        str
            .entrySet()
            .stream()
            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .collect(
                toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                    LinkedHashMap::new));

    return sortedMap;
  }
}
