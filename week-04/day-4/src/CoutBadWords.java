import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CoutBadWords {

  public static void main(String[] args) {
    checkWords();
  }


  public static void checkWords() {

    String [] badWords = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
    List<String> wordsBad = new ArrayList<>();
    for (String each : badWords) {
      wordsBad.add(each);
      wordsBad.add(each + ".");
      wordsBad.add(each + ",");
    }
    try {
      int count = 0;
      Path getFile = Paths.get("content.txt");
      List<String> lines = Files.readAllLines(getFile);
      List<String> words = new ArrayList<>();
      for (String eachLine : lines) {
        for (String eachWord : eachLine.split(" ")) {
          if(!wordsBad.contains(eachWord.toLowerCase())) {
            words.add(eachWord);
          } else if (wordsBad.contains(eachWord + ".")) {
            words.add(".");
            count++;
          } else if (wordsBad.contains(eachWord + ",")) {
            words.add(",");
            count++;
          } else {
            count++;
          }
        }
      }
      System.out.println(words);
      System.out.println(count);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
