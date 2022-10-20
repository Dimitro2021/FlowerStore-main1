package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StoreTest {
    @Test
    public void testStore() {
        Store store = new Store();
        int length = 1;
        int price = 45;
        Rose rose = new Rose(length, FlowerColor.RED, price);
        Tulip tulip = new Tulip(length, FlowerColor.RED, price);
        store.addFlower(rose);
        store.addFlower(tulip);
        Assertions.assertEquals(rose, store.search(rose));
    }
}
