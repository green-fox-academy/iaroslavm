package AircraftApp;

public class Aircraft {
    private String type;
    private int maxAmmo;
    private int baseDamage;
    private int ammoStorage = 0;

    Aircraft() {

    }

    String getType(){
        return this.type;
    }

    String getStatus(){
        return "Type " + this.type + ", "
                + "Ammo: " + this.ammoStorage
                + ", Base Damage: " + this.baseDamage
                + ", All Damage: " + this.baseDamage * this.ammoStorage;
    }

}
