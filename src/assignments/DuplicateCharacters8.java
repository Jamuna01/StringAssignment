
/*
 * 8. Program to find the duplicate characters in a string.
 */
package assignments;

import java.util.Scanner;

public class DuplicateCharacters8 
{
	public static void main(String[] args)
	{
	
	Scanner console = new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	String str = console.nextLine();
	
	char ch[] = str.toCharArray();
	
	System.out.println("Duplicate characters are: ");
	
	for(int i = 0; i< str.length(); ++i)
	{
		for(int j = i+ 1; j <str.length(); ++j)
		{
			if(ch[i] == ch[j])
			{
				System.out.print(ch[i] + " ");
				break;
			}
			
		}
		
		
	}
	
	}
	
}