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
        Rose rose1 = new Rose();
        Tulip tulip = new Tulip();
        rose1.setColor(FlowerColor.RED);
        tulip.setColor(FlowerColor.BLUE);

        store.addFlower(rose1);
        store.addFlower(tulip);
        Assertions.assertEquals(rose1, store.search(rose1));
    }
}
