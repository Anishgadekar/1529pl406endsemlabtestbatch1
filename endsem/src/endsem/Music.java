package endsem;



public class Music {

	private int volume;
	private boolean status;

	public Music(boolean b, int i) {
		// TODO Auto-generated constructor stub
		this.status=b;
		this.volume=i;
	}
	void musicon()
	{
		this.status=true;
		System.out.println("Sound System is on");
	}
	void musicoff()
	{
		this.status=false;
		System.out.println("sound System is off");
	}
	
	public void volumedown() {
		if(this.status==true)
		{
		this.volume=this.volume-1;
		System.out.println("volume down to "+this.volume);
		}
		else
		{
			System.out.println("sound system is off" );
		}
	}
	public void volumeup() {
		if(this.status==true)
		{
		this.volume=this.volume+1;
		System.out.println("volume up to "+this.volume);
		}
		
		else
		{
			System.out.println("sound system is off" );
		}
		
	}
	public int getmvol()
	{
		
		return this.volume;
		
	}
}


