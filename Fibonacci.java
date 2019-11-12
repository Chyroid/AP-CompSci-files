
import java.util.Scanner;

public class Fibonacci
{
	public static void main (String[]args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter a number from 4 to 20:");
			n = sc.nextInt();
			System.out.println("The " +n+ "th number in the fibonacci sequence is " + fibonacci(n) + ".");
		}
		while(n >= 1);
	}
	public static long fibonacci(int n)
	{
		int x = 1, y = 1, z = 0;
		for (int i = 3; i <= n; i++)
		{
			z = x + y;
			x = y;
			y = z;
		}
		return z;
	}
}