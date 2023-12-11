import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ItemFabric generator = new GoldGenerator();
//        generator.openRewgard();
//        generator = new GoldGenerator();
//        generator.openRewgard();


        List <ItemFabric> fabricList = new ArrayList<>();
        fabricList.add(new GoldGenerator());
        fabricList.add(new DiamondGenerator());
        fabricList.add(new SapphireGenerator());

        for (int i = 0; i < 5; i++) {
            int randomNum = (int)(Math.random() * ((2 - 0) + 1)) + 0;
            ItemFabric fabric = fabricList.get(randomNum);
            fabric.openRewgard();
        }

    }
}