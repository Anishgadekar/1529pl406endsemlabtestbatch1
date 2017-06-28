package endsem;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AcTest {
Ac ac1 =new Ac(true,16);
	@Test
	public void testtempup() {
		
		 System.out.println("current tempreture is " +ac1.getTemprature() );
		
		ac1.tempratureup();
        assertEquals(17,ac1.getTemprature());
	
	}

	@Test
	public void testtempdown() {
		 System.out.println("current tempreture is " +ac1.getTemprature() );
		ac1.tempraturedown();
        assertEquals(15,ac1.getTemprature());
	
	}

	
}
