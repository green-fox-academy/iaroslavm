import com.sun.prism.shader.AlphaOne_RadialGradient_AlphaTest_Loader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers =
            Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        System.out.println("Exercise 1: " + ExOneEvenNumbers.getEven(numbers));
        System.out.println("Exercise 2: " + ExTwoSquarePosititve.getResult(numbers));

        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> numbersEmpty = Arrays.asList();
        System.out.println("Exercise 3: " + ExThreeCheckValueSize.getResult(numbers2));
        System.out.println("Exercise 4: " + ExFourMeanOdds.getDoubleResult(numbers));
        System.out.println("Exercise 4: "
            + ExFourMeanOdds.getIntResult(numbers));
        System.out.println("Exercise 4 (empty list): "
            + ExFourMeanOdds.getIntResult(numbersEmpty));

        List<Integer> numbers3 =
            Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        System.out.println("Exercise 5: "
            + ExFiveOddSum.getResult(numbers3));

        String str = "This Is a Word that is A Bird.";
        System.out.println("Exercise 6: "
            + ExSixUpperCaseFind.getResult(str));

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA",
            "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        System.out.println("Exercise 7: "
            + ExSevenFindStringParam.getResult(cities,'Z'));

        List<Character> characterList = Arrays.asList('a','b','c','d','e');
        System.out.println("Exercize 8: " + ExEightConcatenateString.getResult(str,characterList));

        System.out.println("Exercize 9: " + ExNineCharFrequency.getResult(str));

        checkFox();

        System.out.println(ExElevenWiki.checkWiki());

        System.out.println("Ex 12: ");
        ExTwelweStarWars.getResult();
    }

    public static void checkFox(){
        List<Fox> foxSquad = new ArrayList<>(Arrays.asList(new Fox("John","Black",15)
            , new Fox("Black","Black",5)
            , new Fox("Fox","White",3)
            , new Fox("Green","Black",7)
            , new Fox("Blacky","Green",5)
            , new Fox("Mox","Red",3)
            , new Fox("John","Red",4)
            , new Fox("Frosty","Green",2)));

        System.out.println("Ex 10, green foxes names:");
        findGreenFoxes(foxSquad).stream().forEach(fox -> System.out.println(fox.getName()));
        System.out.println("Ex 10, young green foxes names:");
        findYoungGreenFoxes(foxSquad).stream().forEach(fox -> System.out.println(fox.getName()));
        System.out.println("Ex 10: " + findFrequency(foxSquad));


    }

    public static List<Fox> findGreenFoxes(List<Fox> foxes){
       foxes = foxes.stream()
            .filter(fox -> fox.getColor().toLowerCase().equals("green"))
            .collect(Collectors.toList());
        return foxes;
    }

    public static List<Fox> findYoungGreenFoxes(List<Fox> foxes){
       foxes = foxes.stream()
            .filter(fox -> fox.getColor().toLowerCase().equals("green"))
            .filter(fox -> fox.getAge() < 5)
            .collect(Collectors.toList());
        return foxes;
    }

    public static Map<String,Long> findFrequency(List<Fox> foxes){
        Map<String, Long> foxMap =
            foxes
                .stream()
                .collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.counting())); // I cannot
        return foxMap;
    }


}
