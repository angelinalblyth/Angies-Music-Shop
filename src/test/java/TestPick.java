import Accessories.Pick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPick {

    Pick pick;

    @Before
    public void setUp() throws Exception {
        pick = new Pick("Gibson", 2, 5, "classic 351", "Medium");
    }

    @Test
    public void pickHasBrand() {
        assertEquals("Gibson", pick.getBrand());
    }

    @Test
    public void pickHasShape() {
        assertEquals("classic 351", pick.getShape());
    }

    @Test
    public void pickHasWeight() {
        assertEquals("Medium", pick.getWeight());
    }
}
