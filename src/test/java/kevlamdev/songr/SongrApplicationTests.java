package kevlamdev.songr;

import kevlamdev.songr.model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class SongrApplicationTests {
	@Autowired
	MockMvc mockMvc;
	@Test
	void testHelloWorld() throws Exception
	{
		mockMvc.perform(get("/hello"))
				.andDo(print())  // enable for debugging
				.andExpect(content().string(containsString("hello world")))
				.andExpect(status().isOk());
	}
	@Test
	void testCreateAlbum() throws Exception
	{
		System.out.println("Testing album creation POST");
		mockMvc.perform(post("/add-album")
						.contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
						.param("title", "Test Album")
						.param("artist", "Test Artist")
						.param("songCount","20")
						.param("length", "1200")
						.param("imageUrl", "hello.jpg")
				)
				.andDo(print())
				.andExpect(redirectedUrl("/albums"))
				.andExpect(status().isFound());
	}
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
