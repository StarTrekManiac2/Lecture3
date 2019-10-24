/*
 * Practising While Loops
 * @author st20155985
 */

package activity6_loopingwhiletrue;

public class LoopWhileTrue
{

	public static void main(String[] args)
	{
		
		/* ********************************************************************************
		 * ****************************************
		 * HOW IT WORKS
		 * ****************************************
		 * 	Start of the program:
		 * 	1. The value of 'i' starts at 100.
		 * 	2. The While loop runs whilst 'i' is always bigger than 0.
		 * 
		 * 	When Line 39 is used:
		 * 	3a. For each iteration, we DECREASE the value of 'i' by 10 (100, 90, 80....).
		 * 	4a. The program stops iterating when 'i' becomes 0.
		 * 
		 * 	Alternatively when Line 42 is used instead:
		 * 	3b. For each iteration, we INCREASE the value of 'i' by 10 (100, 110, 120....).
		 * 	4b. The program continues to iterate infinitely because 'i' never becomes 0.
		 * ********************************************************************************/
		
		// Declaring variables
		int i = 100;
		
		// While-Loop to output the value of i with each iteration as long as i is bigger than 0
		while (i > 0)
		{
			
			// In the current iteration, decrease i by 10 (this prevents an infinite loop!)
			i -= 10;
			
			// In the current iteration, increase i by 10 (this causes an infinite loop!)
			// i += 10;
			
			System.out.println("The value of i is: " + i);
		}

	}

}
