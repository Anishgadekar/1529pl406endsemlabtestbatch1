package endsem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testtv {

    Tv tv1;
   @Before
   public void setUp() throws Exception {
           tv1=new Tv(true,10,20);
          
   }

   @Test
   public void testchennelup () {
	   System.out.println("current channel is" +tv1.getchanel() );

           tv1.chennelup();
           assertEquals(11,tv1.getchanel());
   }

   @Test
   public void testchenneldown() {
	   System.out.println("current channel is" +tv1.getchanel() );

           tv1.chenneldown();
           assertEquals(9,tv1.getchanel());
   }
   @Test
   public void testvolup() {
       
	   System.out.println("current volume is" +tv1.getvol() );
       tv1.volumeup();
       assertEquals(21,tv1.getvol());
}
   @Test
   public void testvoldown() {
	   System.out.println("current volume is" +tv1.getvol() );

       tv1.volumedown();
       assertEquals(19,tv1.getvol());
}
   
   

}
