import Enums.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Steinway", InstrumentType.STRING, "black", 600, 950, "14/07/2015");
    }

    @Test
    public void hasLastMaintenance() {
        assertEquals("14/07/2015", piano.getLastMaintenance());
    }

    @Test
    public void canPlay() {
        assertEquals("Piano plays", piano.play());
    }

    @Test
    public void hasMarkup() {
        assertEquals(350, piano.calculateMarkup());
    }
}
