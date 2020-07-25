package lecture1;

import java.util.Scanner;

public class primenumbers {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(n);
		int i = 2, flag = 0;
		while (i < n) {
			if (n % i == 0) {
				flag = 1;
			}

			i = i + 1;
		}

		if (flag == 1) {
			System.out.println("not prime");

		} else {
			System.out.println("prime");
		}
	}

}
