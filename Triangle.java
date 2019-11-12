
import java.util.Scanner;

public class Triangle
{
	public static void main (String[]args)
	{
		int u;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter number of rows, 0 to quit");
			u = sc.nextInt();
			printStarTriangle(u);
		}
		while(u > 0);
	}
	public static void printStarTriangle(int u)
	{
		for (int i = 0; i<= u; i++)
		{
			for (int g = u - i; g> 0; g--)
			{
				System.out.print(" ");
			}
			for (int j = 0; j <= (2 * i); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}