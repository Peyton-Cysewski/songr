package com.example.songr;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void testAlbumGetters() {
		Album album = new Album("title", "artist", 5, 12, "url");
		assertEquals("title", album.getTitle());
		assertEquals("artist", album.getArtist());
		assertEquals(5, album.getSongCount());
		assertEquals(12, album.getLength());
		assertEquals("url", album.getImageURL());
	}

	@Test
	void testAlbumSetters() {
		Album album = new Album("title", "artist", 5, 12, "url");
		album.setTitle("title2");
		album.setArtist("artist2");
		album.setSongCount(10);
		album.setLength(24);
		album.setImageURL("url2");
		assertEquals("title2", album.getTitle());
		assertEquals("artist2", album.getArtist());
		assertEquals(10, album.getSongCount());
		assertEquals(24, album.getLength());
		assertEquals("url2", album.getImageURL());
	}
}
