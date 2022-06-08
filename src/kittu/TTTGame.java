package kittu;

import java.util.Scanner;

public class TTTGame {
	public static char[] board = new char[] {'0','0','0','0','0','0','0','0','0','0'};
	public static char userChar;
	static Scanner sc = new Scanner(System.in);
	public static void selection()
	{
		System.out.println("Enter X or O to select your character");
		userChar = sc.next().charAt(0);
		if(userChar =='X')
		{
			System.out.println("Your character is X");
		}
		else if(userChar =='O')
		{
			System.out.println("Your character is O");
		}
		else {
			System.out.println("Please enter only X or O");
		}
		
	}
	
}
