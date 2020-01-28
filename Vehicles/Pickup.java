public class Pickup extends Truck
{
	private int CWL;
	
	public Pickup (String ma, String mo, int y, int WL)
	{
		super(ma, mo, y);
		CWL = WL;
		licenseType = 'C';
		
	}
	
	public String getInfo()
	{
		return (super.getInfo() + getYear() + " " + getMake() + " " + getModel() + " pickup, with a CWL of " + CWL + " pounds. We have a class "  + licenseType + " license.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}