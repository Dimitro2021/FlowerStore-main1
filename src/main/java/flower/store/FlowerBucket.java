package flower.store;

import java.util.ArrayList;

public class FlowerBucket {
    private int allPrice = 0;
    private ArrayList<FlowerPack> packList = new ArrayList<>();
    public int getPrice() {
        return allPrice;
    }

    public void add(FlowerPack flowerPack) {
        packList.add(flowerPack);
        allPrice += flowerPack.getPrice();
    }
}
