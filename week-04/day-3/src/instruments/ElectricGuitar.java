package instruments;

import java.sql.SQLOutput;

public class ElectricGuitar extends StringedInstrument {

    ElectricGuitar(){
        super(6,  "Electric Guitar");
    }

    ElectricGuitar(int numStrings){
        super(numStrings,  "Electric Guitar");
    }

    @Override
    void sound() {
        System.out.println("Electric Guitar, a " + super.numberOfStrings + " stringed instrument that goes Twaang");
    }


}
