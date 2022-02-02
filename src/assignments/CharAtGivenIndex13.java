/*
 * 13. Write a Java program to get the character at the given index within the string.
 *     Example:
 *     Original String = Java Exercises!
 *     The character at position 0 is J
 *     The character at position 10 is i
 */

package assignments;

import java.util.Scanner;

public class CharAtGivenIndex13
{
	public static void main(String[] args)
	{
	
	Scanner console = new Scanner(System.in);
	
	System.out.println("Enter sentence: ");
	String sen = console.nextLine();
	
	 //char ch[] = sen.toCharArray();
	 System.out.println("Enter index: ");
	int index = console.nextInt();

	char ch = 0;
	
	for(int i = 0; i<sen.length(); ++i)
	{
		ch = sen.charAt(index);
	}
	
	System.out.println("The character at "+ index + " position is " + ch);
	
	}
}
