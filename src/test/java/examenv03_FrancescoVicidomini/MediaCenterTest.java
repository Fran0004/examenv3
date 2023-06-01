package examenv03_FrancescoVicidomini;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.cuatrovientos.fourparty.Film;
import org.cuatrovientos.fourparty.MediaCenter;
import org.cuatrovientos.fourparty.MediaFile;
import org.cuatrovientos.fourparty.Song;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MediaCenterTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testInsert() {
		MediaCenter med= new MediaCenter();
		Song s1 = new Song("cancion", null, 0);
		Song expected= s1 ;
		med.newFile(s1);
		MediaFile res= med.searchFile("cancion");
		
		assertEquals(s1.title,res.title);
	}

	@Test
	void testRemoveFile() {
		MediaCenter med= new MediaCenter();
		Song s1 = new Song("cancion", null, 0);
		Song expected= null ;
		med.newFile(s1);
		
		assertEquals(expected,med.searchFile("cancion"));
		Film f1 = new Film("peli", 0, null, null);
		Film expected1= null ;
		med.newFile(f1);
		
		assertEquals(expected,med.searchFile("peli"));
	}

	@Test
	void testUpdate() {
		MediaCenter med= new MediaCenter();
		Song s1 = new Song("cancion", null, 0);
		String expected= "test" ;
		med.newFile(s1);
		
		
		assertEquals(expected,med.UpdateTitulo("test"));
		Film f1 = new Film("peli", 0, null, null);
		Film expected1= "test2" ;
		med.newFile(f1);
		
		assertEquals(expected,med.UpdateTitulo("test2"));
		
		
		
	}

	@Test
	void testShowFiles() {
		fail("Not yet implemented");
	}

}
