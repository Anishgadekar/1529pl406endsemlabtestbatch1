package endsem;
public class Light {

	private boolean status;

	public Light(boolean b) {
		
		this.status=b;
	}
	void lighton()
	{
		this.status=true;
		System.out.println("The Light is on");
	}
	void lightoff()
	{
		this.status=false;
		System.out.println(" The light is off");
	}
	public boolean getlight()
	{
		
		return this.status;
		
	}
}
