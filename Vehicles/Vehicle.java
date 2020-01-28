public class Vehicle 
{
    private String make;
    private String model;
    private int year;

    public Vehicle(String ma, String mo, int y)
    {
        make = ma;
        model = mo;
        year = y;
    }

    public String getMake()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public int getYear()
    {
    	return year;
    }
      
    public String getInfo()
    {
        return "We made a ";
    }
}
