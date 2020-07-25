package lecture1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int rem;
		System.out.println("enter the number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;

		while (n > 0) {
			rem = n % 10;
			ans = ans * 10 + rem;
			n = n / 10;
		}

		System.out.print(ans);

	}

}
