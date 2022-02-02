/*
 * 4. Program to Count the total number of characters in a string.
 */
package assignments;

import java.util.Scanner;

public class TotalNumOfCharInString4 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str = console.nextLine();
		
		char ch[] = str.toCharArray();
		int count = 0;
		for(int i = 0; i<ch.length; ++i)
		{
			count++;
		}
		System.out.println("total number of characters in a string are: " + count);
		//System.out.println(str.length());
	}
}
