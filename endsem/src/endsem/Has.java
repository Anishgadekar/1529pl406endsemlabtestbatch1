package endsem;

public class Has {

	public static void main(String[] args) {

		Tv tv1 =new Tv(true,10,20);
	
		Light l1=new Light(true);
		Ac ac1=new Ac(true,16);
		Washing w1 =new Washing(true);
		Music m1=new Music(false,10);

		
		Howner own= new Howner(tv1,l1,ac1,w1,m1);
		
		System.out.println("\t Welcome \n");
		
		
		own.tv.tvoff();
		own.tv.tvon();
		own.tv.chenneldown();
		own.tv.chennelup();
		own.tv.volumedown();
		own.tv.volumeup();
		
		own.ac.acon();
		own.ac.tempraturedown();
		own.ac.tempratureup();
		own.ac.acoff();
		
		own.washing.won();
		own.washing.woff();
		
		own.music.musicon();
		own.music.volumedown();
		own.music.volumeup();
		own.music.musicoff();
		
		own.light.lighton();
		own.light.lightoff();
		
		
		
	}

}
