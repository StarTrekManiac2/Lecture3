/*
 * Practising the use of If-Else statements
 * @author st20155985
 */

package activity3_ifelse;

public class IfElse
{

	public static void main(String[] args)
	{
		
		// Declaring time of day (hour)
		int hours = 14;
		
		// If-Else statement to determine the output suitable based on the hour of the day
		if (hours < 12)
		{
			System.out.println("Good Morning!\nCurrent Hour: " + hours + ":00");
		}
		else if (hours < 18)
		{
			System.out.println("Good Afternoon!\nCurrent Hour: " + hours + ":00");
		}
		else if (hours <= 24)
		{
			System.out.println("Good Evening!\nCurrent Hour: " + hours + ":00");
		}
		else
		{
			System.out.println("This isn't Mars - there are only 24 hours in the day.");
		}

	}

}
