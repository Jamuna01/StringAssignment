/*
 * 1. Program to remove all the white spaces from a string
 */
package assignments;

import java.util.Scanner;

public class RemoveWhiteSpaces1 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter sentence: ");
		String sentence = console.nextLine();
		
		RemoveWhiteSpaces1 rw = new RemoveWhiteSpaces1();
		rw.whiteSpaces(sentence);
	}
	public void whiteSpaces(String sentence)
	{
		System.out.println(sentence.replaceAll(" ", ""));
	}
}
