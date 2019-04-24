package AircraftApp;

public class Aircraft {
    private String type;
    private int maxAmmo;
    private int baseDamage;
    private int ammo;

    Aircraft(String type) {
        this.type = type;
        if (type.equals("F35")) {
            this.baseDamage = 12;
            this.maxAmmo = 50;
        } else {
            this.baseDamage = 8;
            this.maxAmmo = 30;
        }
        this.ammo = 0;

    }

    String getType() {
        return this.type;
    }

    String getStatus() {
        return "Type " + this.type + ", "
                + "Ammo: " + this.ammo
                + ", Base Damage: " + this.baseDamage
                + ", All Damage: " + this.getMaxDamage();
    }

    int fight() {
        int fightDamage = this.ammo * this.baseDamage;
        this.ammo = 0;
        return fightDamage;
    }

    int refill(int maxRefill) {
        int refillNeed = this.maxAmmo - this.ammo;
        this.ammo += refillNeed;
        return maxRefill - refillNeed;
    }

    boolean isPriority() {
        if (this.type.equals("F35")) {
            return true;
        } else {
            return false;
        }
    }

    int getAmmo() {
        return this.ammo;
    }

    int getMaxAmmo() {
        return this.maxAmmo;
    }

    int getMaxAmmo(String type) {
        if (type.equals("F35")) {
            return this.getMaxAmmo();
        } else {
            return this.getMaxAmmo();
        }
    }

    int getMaxDamage() {
        return this.baseDamage * this.ammo;
    }

}

