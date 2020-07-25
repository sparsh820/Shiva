package lecture2;

import java.util.Scanner;

public class pATTERN10 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = 2 * n - 3;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(cst+"\t");

			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" "+"\t");
			}
			int cst=row;
			if(row==n)
			{
				cst=row-1;
			}
			for (; cst >=1; cst--) {
				System.out.print(cst+"\t");

			}
			System.out.println();
			nst = nst + 1;
			nsp = nsp -2;
			row = row + 1;

		}
	}

}
