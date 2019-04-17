import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies = new ArrayList<>();

    SharpieSet(){
        for (int i = 0; i < 3; i++){
            Sharpie sharpieNew = new Sharpie("Black",2.f);
            sharpies.add(i,sharpieNew);
        }
    }
    int countUsable(){
        int count = 0;
        for (Sharpie each : sharpies) {
            if (each.inkAmount > 0) {
                count++;
            }
        }
        return count;
    }
    void remove(){
        int index = 0;
        for (Sharpie each : sharpies){
            if (each.inkAmount == 0) {
                sharpies.remove(index);
            }
            index++;
        }
    }
}
