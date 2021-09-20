import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestSong {
    @Test
    public void testSong1() {
        // Test #1
        Song.collectionName = "Randy's Collection";
        Song sed = new Song("The Ramones", "I Wanna be Sedated", 148);

        assertEquals(Song.collectionName, "Randy's Collection");
    }

    @Test
    public void testSong2() {
        // Test #2
        Song sed = new Song("The Ramones", "I Wanna be Sedated", 148);

        assertEquals(sed.toString(), "I Wanna be Sedated (The Ramones) - 2:28");
    }

    @Test
    public void testSong3() {
        // Test #3
		Song one = new Song("Daft Punk", "One More Time", 322);

        assertEquals(one.toString(), "One More Time (Daft Punk) - 5:22");
    }
}
