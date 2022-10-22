package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import flower.store.Rose;

public class StoreTest {
    @Test
    public void testStore() {
        Store store = new Store();
//        final int LENGTH = 1;
//        final int PRICE = 45;
//        Rose rose = new Rose(LENGTH, FlowerColor.RED, PRICE);
//        Tulip tulip = new Tulip(LENGTH, FlowerColor.RED, PRICE);
        Rose roseA = new Rose();
        Tulip tulip = new Tulip();
        roseA.setColor(FlowerColor.RED);
        tulip.setColor(FlowerColor.BLUE);

        store.addFlower(roseA);
        store.addFlower(tulip);
        Assertions.assertEquals(roseA, store.search(roseA));
    }
}
