/*
 * Practising Do-While Loops
 * @author st20155985
 */

package activity7_dowhile;

public class DoWhile
{

	public static void main(String[] args)
	{
		// Declaring variables
		int num = 50;
		
		// Do-While Loop to count the value of 'num' and increment it by 10...
		do
		{
			System.out.println("Count: " + num);
			num += 10;
		}
		while(num <= 200);	// ...as long as 'num' is 200 or less.

	}

}
