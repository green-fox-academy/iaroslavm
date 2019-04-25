package ToDo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Thing thing1 = new Thing("Milk");
        Thing thing2 = new Thing("Eggs");
        Thing thing3 = new Thing("Butter");
        Thing thing4 = new Thing("Lemon");
        Thing thing5 = new Thing("Cream");

        thing1.complete();
        thing4.complete();

        List<Thing> toDo = new ArrayList<>();

        toDo.add(thing1);
        toDo.add(thing2);
        toDo.add(thing3);
        toDo.add(thing4);
        toDo.add(thing5);

        Collections.sort(toDo);

        System.out.println(toDo.toString());

    }

}
