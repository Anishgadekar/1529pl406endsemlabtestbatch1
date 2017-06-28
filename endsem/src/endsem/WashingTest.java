package endsem;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class WashingTest {

	Washing w1 =new Washing(true);
	
	@Test
	public void testwashingon() {
		 
		 w1.won();
	       assertEquals(true,w1.getwstatus());
		
	}
	@Test
	public void testwashingoff() {
		
		 w1.woff();
	       assertEquals(false,w1.getwstatus());
		
	}
}
