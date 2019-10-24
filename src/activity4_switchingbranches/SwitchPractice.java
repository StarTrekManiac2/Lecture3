/*
 * Practising the use of Switch statements
 * @author st20155985
 */

package activity4_switchingbranches;

public class SwitchPractice
{
	
	public static void main(String[] args)
	{
	
		// Declare variable to represent month number
		int month = 13;
		
		// Switch statement to go through the seasons based on the current month number
		switch (month)
		{
			// Winter Months
			case 1: case 2: case 12:
				System.out.println("Season: Winter");
				break;
				
			// Spring Months
			case 3: case 4: case 5:
				System.out.println("Season: Spring");
				break;
				
			// Summer Months
			case 6: case 7: case 8:
				System.out.println("Season: Summer");
				break;
				
			// Autumn Months
			case 9: case 10: case 11:
				System.out.println("Season: Autumn");
				break;
				
			// Invalid Month Value
			default:
				System.out.println("This still isn't Mars. There are 12 months in a year!");
				break;
		}
		
	}

}
