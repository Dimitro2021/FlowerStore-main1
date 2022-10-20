package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StoreTest {
    @Test
    public void testStore() {
        Store store = new Store();
//        final int LENGTH = 1;
//        final int PRICE = 45;
//        Rose rose = new Rose(LENGTH, FlowerColor.RED, PRICE);
//        Tulip tulip = new Tulip(LENGTH, FlowerColor.RED, PRICE);
        Rose rose = new Rose();
        Tulip tulip = new Tulip();
        rose.setColor(FlowerColor.RED);
        tulip.setColor(FlowerColor.BLUE);

        store.addFlower(rose);
        store.addFlower(tulip);
        Assertions.assertEquals(rose, store.search(rose));
    }
}
