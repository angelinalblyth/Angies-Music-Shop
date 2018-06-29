import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSheetMusic {

    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("Faber Music", 12, 17, "Pam Wedgewood", "Piano Basics Tuition Book and CD");
        }

    @Test
    public void sheetMusicHasAuthor() {
        assertEquals("Pam Wedgewood", sheetMusic.getAuthor());
    }

    @Test
    public void sheetMusicHasTitle() {
        assertEquals("Piano Basics Tuition Book and CD", sheetMusic.getTitle());
    }
}
