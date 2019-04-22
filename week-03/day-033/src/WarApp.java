public class WarApp {
    public static void main(String [] args) {
        Armada newArmada = new Armada("New Armada");
        Armada oldArmada = new Armada("Old Armada");


        System.out.println(oldArmada.countUnSunk());
        System.out.println(newArmada.countUnSunk());

        System.out.println(newArmada.war(oldArmada));
        System.out.println(oldArmada.countUnSunk());
        System.out.println(newArmada.countUnSunk());





    }
}
