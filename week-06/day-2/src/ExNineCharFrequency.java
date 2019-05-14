import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExNineCharFrequency {
  public static Map<Character, Integer> getResult(String str){
//    Character [] charArray = getCharArray(str); // I can write it in a single line
    List<Character> charList = getCharList(getCharArray(str));

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
//        .filter(Character::isUpperCase) // this could be a lambda
        .filter(c -> Character.isUpperCase(c))
        .collect(Collectors.toList());

  }
}
