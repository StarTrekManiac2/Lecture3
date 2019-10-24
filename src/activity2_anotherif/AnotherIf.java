/*
 * Practising the If statement again
 * @author st20155985
 */

package activity2_anotherif;

public class AnotherIf
{

	public static void main(String[] args)
	{
		
		// Declaring variables
		int num = 25;
		
		
		/* ******* BEFORE ******* */
		
		//// Check that 'num' is between 4 and 6 (so true if num=5)
		//if ((num > 4) && (num < 6))
		//{
		//	System.out.println("You must have chosen 5!");
		//}
		
		/* ********************** */
		
		
		
		/* ******* AFTER ******* */
		
		// Check that 'num' is between 4 and 6 (so true if num=5), OR 'num' is bigger than 10
		if (((num > 4) && (num < 6)) || (num > 10))
		{
			System.out.println("You must have chosen 5, or a number above 10!");
		}
		
		/* ********************** */
		
		
		// Out message for program end
		System.out.println("\n*** The End ***");

	}

}
