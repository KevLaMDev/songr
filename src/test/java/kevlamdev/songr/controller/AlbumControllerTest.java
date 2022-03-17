package kevlamdev.songr.controller;

import kevlamdev.songr.model.Album;
import org.junit.jupiter.api.Test;

public class AlbumControllerTest {

    @Test
    void testInstantiateAlbumTest() {
        Album sut = new Album("Formatted Excess", "NxxxxxS", "https://light-in-the-attic.s3.amazonaws.com/uploads/release_image/24364/image/tmp_2F1566602820125-z0zfy11vnu9-6c78dfb70d34963d4384d2aa72b07f13_2Funnamed%2B_287_29%2B_281_29.jpg", 13, 37);
        assert(sut.getTitle().equals("Formatted Excess"));
    }
    @Test
    void testGetAlbumProp() {
        Album sut = new Album("Formatted Excess", "NxxxxxS", "https://light-in-the-attic.s3.amazonaws.com/uploads/release_image/24364/image/tmp_2F1566602820125-z0zfy11vnu9-6c78dfb70d34963d4384d2aa72b07f13_2Funnamed%2B_287_29%2B_281_29.jpg", 13, 37);
        assert(sut.getTitle().equals("Formatted Excess"));
    }
    @Test
    void testSetAlbumProp() {
        Album sut = new Album("Formatted Excess", "NxxxxxS", "https://light-in-the-attic.s3.amazonaws.com/uploads/release_image/24364/image/tmp_2F1566602820125-z0zfy11vnu9-6c78dfb70d34963d4384d2aa72b07f13_2Funnamed%2B_287_29%2B_281_29.jpg", 13, 37);
        sut.setTitle("Disordered Dearth");
        assert(sut.getTitle().equals("Disordered Dearth"));
    }
}
