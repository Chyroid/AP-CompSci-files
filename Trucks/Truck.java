
public class Truck
{
	private int Year;
	private int MPG;
	private String Make;
	private String Model;
	
	public Truck (String m1, String m2, int x)
	{
		Make = m1;
		Model = m2;
		Year = x;
		MPG = 0;
	}

	public void setMPG(int m)
	{
		MPG = m;
	}

	public int getYear()
	{
		int getYear = Year;
		return Year;
	}

	public String getMake()
	{
		String getMake = Make;
		return Make;
	}

	public String getModel()
	{
		String getModel = Model;
		return Model;
	}

	public int getMPG()
	{
		int getMPG = MPG;
		return MPG;
	}

}