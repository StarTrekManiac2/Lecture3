/*
 * Practising the use of Nested For Loops
 * @author st20155985
 */

package activity5_forloops;

public class NestedForLoops
{

	public static void main(String[] args)
	{
		
		// Declare variables
		int num = 0;
		
		// For-Loop (outer) for counting from 1 through 3, then stops at when 'i' reaches 4
		for (int i=1; i<4; i++)
		{
			System.out.println("Outer Loop: i=" + i);
			
			// For-Loop (inner) for counting j, as above, but also adding 1 to the total
			// for 'num' throughout each and every iteration that occurs
			// NOTE: There are 9 iterations in total, so 'num' should be 9 at the end)
			for (int j=1; j<4; j++)
			{
				System.out.println("\tInner Loop: j=" + j);
				System.out.println("\t\tTotal: num=" + ++num);
			}
		}

	}

}
