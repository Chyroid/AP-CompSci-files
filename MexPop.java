public class MexPop
{
	public static void main (String[]args)
	{
		int year = 2010;
		double pop = 111.2;
		double mult = 1.0113;+
		while (pop < 130)
		{
			pop *= 1.0113;
			year++;
			System.out.println(year + " " + pop);
		}
		System.out.println("In " + year + " there will be " + pop + " million cows in Mexico.");
	}
}