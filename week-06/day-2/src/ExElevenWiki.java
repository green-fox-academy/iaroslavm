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
        each = each.replaceAll("[/()'.,;}]", "");
        each = each.replaceAll("\\[(.*?)]", "");
        each = each.replaceAll("ˈ", "");
        newList.addAll(Arrays.asList(each.split(" ")));
      }

      return newList;

    } catch (IOException e) {
      e.printStackTrace();

      return new ArrayList<String>();
    }
  }

  public static Map<String, Long> countWords(List<String> strList){
    return
        strList
            .stream()
            .map(str -> str.replaceAll(", ",""))
            .map(str -> str.replaceAll("\"",""))
            .map(String::toLowerCase)
            .filter(str -> !str.equals(""))
            .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
  }

  public static Map<String, Long> sortList(Map<String, Long> str){
    return
        str
            .entrySet()
            .stream()
            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .limit(10)
            .collect(
                toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                    LinkedHashMap::new));
  }

  public static void checkWiki2(){
    try {
      Files.lines(Paths.get("text.txt"))
          .flatMap(line -> Arrays.stream(line.split(" ")))
          .map(string -> string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase())
          .filter(s -> !s.isEmpty())
          .collect(toMap(s->s, s-> 1, Integer::sum))
          .entrySet()
          .stream()
          .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
          .limit(10)
          .forEach(s -> System.out.println(s.getKey() + ": " + s.getValue()));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
