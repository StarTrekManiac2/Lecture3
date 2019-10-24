/*
 * A simple and devious 'Infinite Loop'
 * @author st20155985
 */

package activity5_forloops;

public class InfiniteLoop
{

	public static void main(String[] args)
	{
		
		/* ********************************************************************************
		 * ****************************************
		 * HOW IT WORKS
		 * ****************************************
		 * 
		 * 	1. We start the value of 'i' at 1.
		 * 	2. We check that the value of 'i' is always bigger than 0 (which it is!).
		 * 	3. We iterate as normal for as long as this is the case (which it always will be!).
		 * 	4. The program continues to iterate infinitely.
		 * ********************************************************************************/
		
		for (int i=1; i>0; i++)
		{
			System.out.println("Count: " + i);
		}

	}

}
