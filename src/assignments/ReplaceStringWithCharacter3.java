/*
 * 3. Program to replace the spaces of a string with specific character.
 */

package assignments;

import java.util.Scanner;

public class ReplaceStringWithCharacter3 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter sentence: ");
		String str = console.nextLine();
		
		System.out.println(str.replaceAll(" ", "_"));
	}
}
