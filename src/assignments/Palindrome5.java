/*
 * 5. Program to determine whether a given string is palindrome.
 */

package assignments;

import java.util.Scanner;

public class Palindrome5
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = console.next();
		
		String rev = "";
		char ch; 
		
		for(int i = (word.length()-1); i>= 0; --i)
		{
			ch = word.charAt(i);
			rev = rev + ch;
		}
			
		if(word.equals(rev))
		{
			System.out.println("Given word '" + word + "' is palindrome.");
		}
		else
			System.out.println("Given word '" + word + "' is not palindrome.");
	}
}
