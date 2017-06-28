package endsem;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class LightTest {

	Light l1=new Light(true);

	@Test
	public void testlighton() {
		//fail("Not yet implemented");
		

		 l1.lighton();
	       assertEquals(true,l1.getlight());
	}

	
	@Test
	public void testlightoff() {
		//fail("Not yet implemented");
		

		 l1.lightoff();
	       assertEquals(false,l1.getlight());
	}
}
