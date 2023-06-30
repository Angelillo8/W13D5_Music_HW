import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    Guitar guitar;
    Trumpet trumpet;
    MusicSheet musicSheet;
    DrumSticks drumSticks;
    MusicShop musicShop;

    @Before
    public void before() {
        guitar = new Guitar("Conde Hermanos", "Wood", "Brown", "String", 10000, 15000, 6);
        trumpet = new Trumpet("Bach", "Brass", "Golden", "Brass", 3000, 5000, 3);
        musicSheet = new MusicSheet("Music sheet", 50, 75);
        drumSticks = new DrumSticks("Drum sticks", 100, 175);
        musicShop = new MusicShop();
        musicShop.addItem(guitar);
        musicShop.addItem(trumpet);
        musicShop.addItem(musicSheet);
        musicShop.addItem(drumSticks);
    }

    @Test
    public void hasItemsInStock() {
        assertEquals(4, musicShop.countStock());
    }
    @Test
    public void canAddNewItem() {
        GuitarString guitarString = new GuitarString("Guitar string", 50, 100);
        musicShop.addItem(guitarString);
        assertEquals(5, musicShop.countStock());
    }
    @Test
    public void canRemoveItem() {
        musicShop.removeItem(musicSheet);
        assertEquals(3, musicShop.countStock());
    }
}
