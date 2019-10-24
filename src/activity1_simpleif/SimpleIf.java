/*
 * Practising the If statement
 * @author st20155985
 */

package activity1_simpleif;

public class SimpleIf
{

	public static void main(String[] args)
	{
		
		// Declaring score variables
		int maxscore = 50;
		int yourscore = 47;
		
		// Check if your score is less than the max score ('check if true')
		if (yourscore < maxscore)
		{
			// Output message stating the difference
			System.out.println("You scored " + (maxscore-yourscore) + " less than the maximum score possible!");
		}
		
		// Output program end message
		System.out.println("\n*** The End ***");

	}

}
