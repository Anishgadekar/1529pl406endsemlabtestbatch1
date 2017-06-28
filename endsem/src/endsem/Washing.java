package endsem;

public class Washing {
	private boolean status;
public Washing (boolean b) {
		
		this.status=b;
	}
	void won()
	{
		this.status=true;
		System.out.println("washing machine is on");
	}
	void woff()
	{
		this.status=false;
		System.out.println("washing machin is off");
	}
	public boolean getwstatus()
	{
		
		return this.status;
		
	}
}
