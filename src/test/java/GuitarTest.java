import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Conde Hermanos", "Wood", "Brown", "String", 10000, 15000, 6);
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("Traaaaan!", guitar.play());
    }
    @Test
    public void hasManufacturer() {
        assertEquals("Conde Hermanos", guitar.getManufacturer());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5000, guitar.calculateMarkup(guitar.getCost(), guitar.getPrice()), 0.0);
    }

    @Test
    public void hasColour() {
        assertEquals("Brown", guitar.getColour());
    }
}
