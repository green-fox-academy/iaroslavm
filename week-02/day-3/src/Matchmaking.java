import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {


        ArrayList<String> party = new ArrayList<String>();
        ArrayList<String> boys2 = new ArrayList<String>();
        ArrayList<String> girls2 = new ArrayList<String>();

        boys2.addAll(boys);
        girls2.addAll(girls);


        if (boys.size() > girls.size()) {
            for (int i = 0; i < girls.size(); i++) {
                party.add(girls.get(i));
                party.add(boys.get(i));
                boys2.remove(0);
            }
            party.addAll(boys2);
        } else  {
            for (int i = 0; i < boys.size(); i++) {
                party.add(girls.get(i));
                party.add(boys.get(i));
                girls2.remove(0);
            }
            party.addAll(girls2);
        }

        return party;
    }
}