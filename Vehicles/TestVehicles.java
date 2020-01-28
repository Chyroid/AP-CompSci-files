import javax.swing.*;
public class TestVehicles
{
	public static void main (String[]args)
	{
		Vehicle T1 = new Pickup("Toyota", "Tacoma", 2018, 1000);
		Vehicle T2 = new Semi('A',"White", "Freightliner",  2012);
		Vehicle C1 = new Car("Porsche", "356 Speedster", 1956, true);
		Vehicle C2 = new Car("Porsche", "Cayman", 2017, false);
		JOptionPane.showMessageDialog(null, "We made the vehicles,\nnow let's see 'em!");		
		System.out.println(T1.getInfo());
		System.out.println(T2.getInfo());
		System.out.println(C1.getInfo());
		System.out.println(C2.getInfo());
	}
}