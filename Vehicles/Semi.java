public class Semi extends Truck
{
	public Semi (char l, String ma, String mo, int y)
	{
		super(ma, mo, y);
		licenseType = l;
	}
	
	public String getInfo()
	{
		return (super.getInfo() + getYear() + " " + getMake() + " " + getModel() + " semi, and we have a class " + licenseType + " license.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}