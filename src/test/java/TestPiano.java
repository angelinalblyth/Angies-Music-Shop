import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Kawai ", "Rosewood", "White", InstrumentType.KEYBOARD,"Grand Feel Pedal System", 700, 900);
        }

    @Test
    public void pianoHasPedals() {
        assertEquals("Grand Feel Pedal System", piano.getPedals());
    }

    @Test
    public void pianoHasSound() {
        assertEquals("Plink plonk", piano.sound());
    }
}
