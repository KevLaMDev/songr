package kevlamdev.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void testAlbumConstructor() {
		Album sut = new Album("Formatted Excess", "NxxxxxS", "https://light-in-the-attic.s3.amazonaws.com/uploads/release_image/24364/image/tmp_2F1566602820125-z0zfy11vnu9-6c78dfb70d34963d4384d2aa72b07f13_2Funnamed%2B_287_29%2B_281_29.jpg", 13, 37);
		assert(sut instanceof Album);
	}
	@Test
	void testGetters() {
		Album sut = new Album("Formatted Excess", "NxxxxxS", "https://light-in-the-attic.s3.amazonaws.com/uploads/release_image/24364/image/tmp_2F1566602820125-z0zfy11vnu9-6c78dfb70d34963d4384d2aa72b07f13_2Funnamed%2B_287_29%2B_281_29.jpg", 13, 37);
		assert(sut.getTitle().equals("Formatted Excess") && sut.getArtist().equals("NxxxxxS") && sut.getImageUrl().equals("https://light-in-the-attic.s3.amazonaws.com/uploads/release_image/24364/image/tmp_2F1566602820125-z0zfy11vnu9-6c78dfb70d34963d4384d2aa72b07f13_2Funnamed%2B_287_29%2B_281_29.jpg") && sut.getSongCount() == 13 && sut.getLength() == 37);
	}
	@Test
	void testSetters() {
		Album sut = new Album("Formatted Excess", "NxxxxxS", "https://light-in-the-attic.s3.amazonaws.com/uploads/release_image/24364/image/tmp_2F1566602820125-z0zfy11vnu9-6c78dfb70d34963d4384d2aa72b07f13_2Funnamed%2B_287_29%2B_281_29.jpg", 13, 37);
		sut.setTitle("i");
		sut.setArtist("i");
		sut.setImageUrl("i");
		sut.setSongCount(1);
		sut.setLength(1);
		assert(sut.getTitle().equals("i") && sut.getArtist().equals("i") && sut.getImageUrl().equals("i") && sut.getSongCount() == 1 && sut.getLength() == 1);
	}

}
