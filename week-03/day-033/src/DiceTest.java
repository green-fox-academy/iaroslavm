public class DiceTest {

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        DiceSet sixSet = new DiceSet();

        System.out.println(diceSet.roll());

//        for (int i = 0; i < 6; i++) {
//            sixSet.dice.add(i,6);
//        }
//        System.out.println(sixSet.getCurrent());
//
//        while (!diceSet.getCurrent().equals(sixSet.getCurrent())){
//            diceSet.reroll();
//        }
//        System.out.println("Finally all 6s : " + diceSet.getCurrent());


        System.out.println(System.nanoTime());
        for(int i = 0; i < diceSet.getCurrent().size(); i++){
            while(diceSet.getCurrent(i) != 6) {
                diceSet.reroll(i);
                System.out.println(diceSet.getCurrent());
            }
        }
        System.out.println(System.nanoTime());




//        System.out.println(diceSet.getCurrent());
//        System.out.println(diceSet.roll());
//        System.out.println(diceSet.getCurrent());
//        System.out.println(diceSet.getCurrent(5));
//        diceSet.reroll();
//        System.out.println(diceSet.getCurrent());
//        diceSet.reroll(4);
//        System.out.println(diceSet.getCurrent());
    }
}
