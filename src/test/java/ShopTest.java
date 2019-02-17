import Enums.InstrumentType;
import Instruments.Guitar;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;

    @Before
    public void setUp() throws Exception {
        shop = new Shop();
        guitar = new Guitar("Yamaha C40", InstrumentType.STRING, "brown", 100, 150, 6);
        piano = new Piano("Steinway", InstrumentType.STRING, "black", 600, 950, "14/07/2015");

    }

    @Test
    public void canGetStockCount() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItem(guitar);
        shop.addItem(piano);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItem(guitar);
        shop.addItem(piano);
        shop.removeItem(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canGetTotalProfit() {
        shop.addItem(guitar);
        shop.addItem(piano);
        shop.addItem(guitar);
        shop.addItem(piano);
        assertEquals(800, shop.totalProfit());
    }
}
