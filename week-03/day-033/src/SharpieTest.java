public class SharpieTest {
    public static void main(String[] args){
        SharpieSet setSharpies = new SharpieSet(); // automatically contains 3 sharpies
        System.out.println("N of usable sharpies in the set: " + setSharpies.countUsable());

        setSharpies.sharpies.get(1).use();
        setSharpies.sharpies.get(1).use();

        System.out.println("N of usable sharpies in the set: " + setSharpies.countUsable());
        System.out.println("N of total sharpies in the set: " + setSharpies.sharpies.size());

        setSharpies.remove();
        System.out.println("N of usable sharpies in the set: " + setSharpies.countUsable());
        System.out.println("N of total sharpies in the set: " + setSharpies.sharpies.size());

        setSharpies.sharpies.get(0).use();
        setSharpies.sharpies.get(0).use();
        System.out.println("N of usable sharpies in the set: " + setSharpies.countUsable());
        System.out.println("N of total sharpies in the set: " + setSharpies.sharpies.size());

        setSharpies.remove();
        System.out.println("N of usable sharpies in the set: " + setSharpies.countUsable());
        System.out.println("N of total sharpies in the set: " + setSharpies.sharpies.size());
    }
}
