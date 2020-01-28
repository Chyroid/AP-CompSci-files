public class Car extends Vehicle
{
	private boolean isRagtop;
	
	public Car (String ma, String mo, int y, boolean r)
	{
		super(ma, mo, y);
		isRagtop = r;
	}

	public String getInfo()
	{
		if (isRagtop == true)
		{
			return (super.getInfo() + getYear() + " " + getMake() + " " + getModel() + " and it's a convertible!");
		}
		else
		{
			return (super.getInfo() + getYear() + " " + getMake() + " " + getModel() + ".");
		}
	}
}