
public class MakeTrucks
{
	public static void main (String[]args)
	{
		Truck T1 = new Truck("Toyota", "Tacoma", 2006);
		Truck T2 = new Truck("Ford", "F150",  2012);
		T1.setMPG(11);
		T2.setMPG(16);

		System.out.println("We made a "+T1.getYear()+" "+T1.getMake()
			+" "+T1.getModel()+" that gets "+T1.getMPG()+" miles per gallon.");
		System.out.println("We made a "+T2.getYear()+" "+T2.getMake()
			+" "+T2.getModel()+" that gets "+T2.getMPG()+" miles per gallon.");
	}
}