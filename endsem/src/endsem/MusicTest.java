package endsem;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MusicTest {

	Music m1=new Music(true,10);

	@Test
	public void testvolup() {
		//fail("Not yet implemented");
		 m1.volumeup();
	       assertEquals(11,m1.getmvol());
		
		
		
	}
	@Test
	public void testvoldown() {
		//fail("Not yet implemented");
		 m1.volumedown();
	       assertEquals(9,m1.getmvol());
		
		
		
	}

}
