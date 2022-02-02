/*
 * 14. Write a java program to replace all the 'd' characters with 'f'
 */

package assignments;

import java.util.Scanner;

public class ReplaceDWithF14 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sen = console.nextLine();
		
		String str = sen.toLowerCase();
		
		System.out.println("After replacing: "+ str.replace('d', 'f'));
		
		
	}
}
