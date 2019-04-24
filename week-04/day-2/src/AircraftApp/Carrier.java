package AircraftApp;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> myCarrier = new ArrayList<>();
    private int ammoStorage;
    private int health;

    Carrier(int ammoStorage, int health) {
        this.ammoStorage = ammoStorage;
        this.health = health;
    }

    void add(String type) {
        if (type.equals("F35")) {
            myCarrier.add(new F35());
        } else {
            myCarrier.add(new F16());
        }
    }

    void fill() {
        try {
            int test = 1 / this.ammoStorage;


            int totalRefill = 0;
            int countF35 = 0;
            int countF16 = 0;
            for (Aircraft each : myCarrier) {
                totalRefill += each.getMaxAmmo() - each.getAmmo();
                if (each.isPriority()) {
                    countF35++;
                } else {
                    countF16++;
                }
            }

            if (this.ammoStorage < totalRefill) {
                for (Aircraft each : myCarrier) {
                    if (each.isPriority()) {
                        this.ammoStorage = each.refill(this.ammoStorage);
                        if (this.ammoStorage < each.getMaxAmmo()) {
                            break;
                        }
                    }
                }
                if (this.ammoStorage > 8) {
                    for (Aircraft each : myCarrier) {
                        if (!each.isPriority()) {
                            this.ammoStorage = each.refill(this.ammoStorage);
                            if (this.ammoStorage < each.getMaxAmmo()) {
                                break;
                            }
                        }
                    }

                }

            } else {
                for (Aircraft each : myCarrier) {
                    this.ammoStorage = each.refill(this.ammoStorage);
                }
            }
        } catch (Exception e) {
            System.out.println("Ammo storate is at 0");
        }

    }

    void info() {
        int countF35 = 0;
        int countF16 = 0;
        int damageF16 = 0;
        int damageF35 = 0;
        for (Aircraft each : myCarrier) {
            if (each.isPriority()) {
                countF35++;
                damageF35 += each.getMaxDamage();
            } else {
                countF16++;
                damageF16 += each.getMaxDamage();
            }
        }
        int totalDamage = damageF16 + damageF35;

        System.out.println("HP: " + this.health + ", "
                + countF16 + " of F16 and " + countF35
                + " of F35, "
                + "Ammo Storage: " + this.ammoStorage
                + ", Total Damage " + totalDamage);
        System.out.println("Aircrafts:");
        for(Aircraft each : myCarrier){
            System.out.println(each.getStatus());
        }
    }

    List<Aircraft> getCarrier(){
        return this.myCarrier;
    }

    int getHealth(){
        return this.health;
    }

    void setHealth(int damage){
        this.health -= damage;
    }

    void fight(Carrier otherCarrier){
        int myCarrierTotalDamage = 0;
        int otherCarrierTotalDamage = 0;

        for (Aircraft each : this.myCarrier) {
            myCarrierTotalDamage += each.getMaxDamage();
            each.fight();
        }
        for (Aircraft each : otherCarrier.myCarrier) {
            otherCarrierTotalDamage += each.getMaxDamage();
            each.fight();
        }

        this.setHealth(otherCarrierTotalDamage);
        otherCarrier.setHealth(myCarrierTotalDamage);
    }
}


