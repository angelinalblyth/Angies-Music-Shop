import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Fender", "Maple", "Black", InstrumentType.STRING,"Mustang", 300.00, 550.00);
    }

    @Test
    public void guitarHadBrand() {
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void guitarHasMaterial() {
        assertEquals("Maple", guitar.getMaterial());
    }

    @Test
    public void guitarHasColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void guitarHasType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void guitarHasBoughtPrice() {
        assertEquals((Double)300.00, guitar.getBoughtPrice());
    }

    @Test
    public void guitarHasSellPrice() {
        assertEquals((Double)550.00, guitar.getSellPrice());
    }

    @Test
    public void guitarHasShape() {
        assertEquals("Mustang", guitar.getShape());
    }

    @Test
    public void guitarPlays() {
        assertEquals("Strum strum strum", guitar.sound());
    }
}
