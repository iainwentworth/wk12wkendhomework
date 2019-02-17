import Enums.InstrumentType;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Yamaha C40", InstrumentType.STRING, "brown", 100, 150, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Yamaha C40", guitar.getName());

    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(100, guitar.getCostPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(150, guitar.getSellPrice());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Guitar plays", guitar.play());
    }

    @Test
    public void hasMarkup() {
        assertEquals(50, guitar.calculateMarkup());
    }
}
