import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberConverter {

  public String numberWord(int i){
    List<Integer> intList = new ArrayList<>();
    List<String> onesList = new ArrayList<>();
    List<String> teensList = new ArrayList<>();
    List<String> teensList2 = new ArrayList<>();
    List<String> auxWords = new ArrayList<>();

    String strNum = "";

    onesList.add("");
    onesList.add("one");
    onesList.add("two");
    onesList.add("three");
    onesList.add("four");
    onesList.add("five");
    onesList.add("six");
    onesList.add("seven");
    onesList.add("eight");
    onesList.add("nine");

    teensList.add("ten");
    teensList.add("eleven");
    teensList.add("twelve");
    teensList.add("thirteen");
    teensList.add("fourteen");
    teensList.add("fifteen");
    teensList.add("sixteen");
    teensList.add("seventeen");
    teensList.add("eighteen");
    teensList.add("nineteen");

    teensList2.add("twenty");
    teensList2.add("thirty");
    teensList2.add("forty");
    teensList2.add("fifty");
    teensList2.add("sixty");
    teensList2.add("seventy");
    teensList2.add("eighty");
    teensList2.add("ninety");

    auxWords.add("hundred");
    auxWords.add("thousand");
    auxWords.add("million");
    auxWords.add("billion");
    auxWords.add("quadrillion");




    int iter = i;
    int ones = i % 10;
    do{
      intList.add(iter % 10);
      iter = iter / 10;
    } while (iter != 0);

    int figNum = intList.size();

    int iterations = 1;

    while(figNum / 3 != 0){
      iterations++;
      figNum /=3;
    }

    if (intList.size() == 1) {
      strNum = onesList.get(ones);
    } else if (intList.size() == 2 && intList.get(1) == 1) {
      strNum = teensList.get(intList.get(0));
    } else if (intList.size() == 2 && intList.get(1) != 1) {
      strNum = teensList2.get(intList.get(1)-2) + (onesList.get(ones).equals("") ? onesList.get(ones) : " " + onesList.get(ones));
    } else if (intList.size() == 3) {
      strNum = onesList.get(intList.get(intList.size() - 1)) + " hundred";
      if (intList.get(1) == 1) {
        strNum += " " + teensList.get(intList.get(0));
      } else if (intList.get(1) > 1) {
        strNum += " " +  teensList2.get(intList.get(1) - 2) + (onesList.get(ones).equals("") ? onesList.get(ones) : " " + onesList.get(ones));
      } else if (intList.get(1) == 0) {
        strNum += " " +  onesList.get(ones);
      }
    }


    return strNum;
  }
}
