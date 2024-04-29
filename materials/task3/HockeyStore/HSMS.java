package midterm.dachi_gobejishvili_1.materials.task3.HockeyStore;

import java.util.ArrayList;
import java.util.List;
public class HSMS {
    private List<HockeyStick> storage = new ArrayList<HockeyStick>();

    public void addHockeyStick(HockeyStick hockeyStick){
        storage.add(hockeyStick);
    }
    public boolean removeHockeyStick(HockeyStick hockeyStick){
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++){
            HockeyStick hs = storage.get(i);
            if (hs.getType().equals(hockeyStick.getType()) && hs.getSignature().equals(hockeyStick.getSignature())){

            }
        }
        return removed;
    }
    public void printStorage(){
        if (storage.isEmpty()){
            System.out.println("the items are missing");
        } else {
            for (HockeyStick hs: storage){
                System.out.println(hs.getSignature() + "," + hs.getType());
                System.out.println();
            }
        }
    }
}
