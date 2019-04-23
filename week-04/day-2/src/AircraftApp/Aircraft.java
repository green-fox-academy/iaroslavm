package AircraftApp;

public class Aircraft {
    private String type;
    private int maxAmmo;
    private int baseDamage;
    private int ammoStorage;

    Aircraft(String type, int maxAmmo, int baseDamage) {
        this.type = type;
        this.baseDamage = baseDamage;
        this.maxAmmo = maxAmmo;
        this.ammoStorage = 0;

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

    int fight(){
        int fightDamage = this.ammoStorage * this.baseDamage;
        this.ammoStorage = 0;
        return fightDamage;
    }

    int refill(int maxRefill) {
        int refillNeed = this.maxAmmo - this.ammoStorage;
        this.ammoStorage += refillNeed;
        return maxRefill - refillNeed;
    }

    boolean isPriority (){
        if(this.type.equals("F35")){
            return true;
        } else{
            return false;
        }
    }



}
