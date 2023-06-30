import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString("Guitar string", 50, 100);
    }

    @Test
    public void hasType() {
        assertEquals("Guitar string", guitarString.getType());
    }

    @Test
    public void hasCost() {
        assertEquals(50, guitarString.getCost(), 0.0);
    }

    @Test
    public void hasPrice() {
        assertEquals(100, guitarString.getPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50, guitarString.calculateMarkup(guitarString.getCost(), guitarString.getPrice()), 0.0);
    }

}
