
/*
 * 2. Program to replace lower-case characters with upper-case and vice versa.
 */
package assignments;

import java.util.Scanner;

public class ReplaceCase2
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter sentence: ");
		String sen = console.nextLine();
		
		ReplaceCase2 rc = new ReplaceCase2();
		rc.replaceWithLowerCase(sen);
		rc.replaceWithUpperCase(sen);
		
	}
	public void replaceWithLowerCase(String sentence)
	{
		String str = sentence.toLowerCase();
		System.out.println("Replace to lower case: " + str);
	}
	public void replaceWithUpperCase(String sentence)
	{
		String str = sentence.toUpperCase();
		System.out.println("Replace to upper case: " + str);
	}
}
