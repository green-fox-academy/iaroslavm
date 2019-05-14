import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExNineCharFrequency {
  public static Map<Character, Long> getResult(String str){
//    Character [] charArray = getCharArray(str); // I can write it in a single line
    str = str.replaceAll("[.,;\\s]", "");
    List<Character> charList = getCharList(getCharArray(str));

    Map<Character,Long> freqMap = getCharMap(charList);

    return freqMap;
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
