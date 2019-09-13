import java.util.Scanner;

public class Hello 
{
	static int num = 34;
	static String s;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
   		getName();
   		int x, sum;
   		x = 400;
   		sum = x+num;
   		System.out.println("Hello, "+s+sum);
   	}
   	public static void getName()
   	{
   		System.out.println("Enter your name");
   		s = sc.nextLine();
   	}
} 