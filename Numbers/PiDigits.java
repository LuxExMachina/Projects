import java.util.Scanner;

public class PiDigits
{
	public static void main()
	{
		Scanner input = new Scanner("System.in");
		int n;
		
		while(true)
		{
			System.out.print("Enter the number of digits to round pi to: ");
			try
			{
				n = input.nextInt();
			}
			catch(NumberFormatException e)
			{
				System.out.println("Please enter a positive integer greater than 0.");
				continue;
			}
			break;
		}
		
		System.out.printf("%(n/10)f",Math.pi);
	}
	
}

