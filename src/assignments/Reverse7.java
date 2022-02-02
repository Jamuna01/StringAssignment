/*
 * 7. Program to find Reverse of a String.
 */

package assignments;

import java.util.Scanner;

public class Reverse7 
{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String str = console.nextLine();
		
		String reverse = "";
		char ch;
		for(int i = str.length()-1; i >=0; --i)
		{
			ch = str.charAt(i);
			reverse = reverse + ch;
		}
		System.out.println("Reverse string is: " + reverse);
	}
}
