package lecture1;

import java.util.Scanner;

public class character {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		char ch = scn.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.println("lowercase");
		}
		if(ch>='A'&& ch<='Z')
		{
			System.out.println("uppercase");
		}
	}
}
