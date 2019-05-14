import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class ExNineCharFrequency {
  public static Map<Character, Long> getResult(String str){
//    Character [] charArray = getCharArray(str); // I can write it in a single line
    str = str.replaceAll("[.,;\\s]", "");
    List<Character> charList = getCharList(getCharArray(str));

    Map<Character,Long> freqMap = getCharMap(charList);

    List<Map.Entry<Character,Long>> freqMapList = new ArrayList<>(freqMap.entrySet());

    Map<Character, Long> sortedMap =
        freqMap
            .entrySet()
            .stream()
            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .collect(
                toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                    LinkedHashMap::new));


    return sortedMap;
  }

  public static Character [] getCharArray(String str){
    return str
        .chars()
        .mapToObj(c -> (char) c) // by default it returns c as integer
        .toArray(Character[]::new); // this could be a lambda
  }

  public static List<Character> getCharList(Character [] charArray){
    List<Character> charList = Arrays.asList(charArray);
    return charList
        .stream()
        .map(c -> Character.toLowerCase(c))
        .collect(Collectors.toList());

  }

  public static Map<Character,Long> getCharMap(List<Character> listChar){
    Map<Character,Long> freqMap;
    freqMap = listChar
        .stream()
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    return freqMap;
  }
}
