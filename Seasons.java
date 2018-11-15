import java.util.Scanner;

public class Seasons 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the month of your birth:  ");
		int month = keyboard.nextInt();
		
		if (month>=1 && month<=12)
		{
			if (month>=3 && month<=5)
				
				System.out.println("Your birthday is in a spring month");
			
			else if (month>=6 && month<=8)
				System.out.println("Your birthday is in a summer month");
			
			else if (month>=9 && month<=11)
				System.out.println("Your birthday is in a fall month");
			
			else if (month==12 || month<=2)
				System.out.println("Your birthday is in a winter month");
		
		}
		else 
			System.out.println("the value you have entered for your month is invalid");
	}

}
