public class MyMath3
{
	static int x,y,z,d;
	static double J;
	static double m;
	
	public static void main (String[]args)
	{
		x = 3;
		y = 5;
		J = ((double)y/x);
		d = (y%x);
		addition(x,y);
		System.out.println(x+" + "+y+" = "+z);
		subtraction(x,y);
		System.out.println(x+" - "+y+" = "+z);
		multiply(x,y);
		System.out.println(x+" * "+y+" = "+z);
		division(x,y);
		System.out.println(y+" / "+x+" = "+J);
		division(x,y);
		System.out.println(y+" / "+x+" = "+(y/x)+" with a remainder of "+d);
	}

	public static void addition(int num1, int num2)
	{
		z = num1 + num2;
	}
	public static void subtraction(int num1, int num2)
	{
		z = num1 - num2;
	}
	public static void multiply(int num1, int num2)
	{
		z = num1 * num2;
	}
	public static void division(int num1, int num2)
	{
		z = num2 / num1;
	}
	public static void modulo (int num1, int num2)
	{
		d = num2 % num1;
	}

}