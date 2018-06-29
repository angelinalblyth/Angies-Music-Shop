import Accessories.Pick;
import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class TestShop {

    Shop shop;
    Guitar guitar;
    Pick pick;

    @Before
    public void setUp() throws Exception {
        shop = new Shop();
        guitar = new Guitar("Fender", "Maple", "Black", InstrumentType.STRING,"Mustang", 300, 550);
        pick = new Pick("Gibson", 2, 5, "classic 351", "Medium");
    }

    @Test
    public void shopStockIsEmpty() {
        assertEquals(0, shop.stockLevel());
    }

    @Test
    public void addGuitarToStock() {
        shop.addItem(guitar);
        assertEquals(1, shop.stockLevel());
    }

    @Test
    public void addAccessoryToStock() {
        shop.addItem(pick);
        assertEquals(1, shop.stockLevel());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItem(guitar);
        shop.addItem(pick);
        shop.removeItem(guitar);
        assertEquals(1, shop.stockLevel());
    }
}
