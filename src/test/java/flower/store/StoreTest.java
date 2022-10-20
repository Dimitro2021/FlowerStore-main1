package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StoreTest {
    @Test
    public void testStore(){
        Store store = new Store();
        Rose rose = new Rose(1, FlowerColor.RED, 44);
        Tulip tulip = new Tulip(1, FlowerColor.RED, 44);
        store.addFlower(rose);
        store.addFlower(tulip);
        Assertions.assertEquals(rose, store.search(rose));
    }
}
