package lecture2;

import java.util.Scanner;

public class pattern9 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		int val=0;
		while (row <= n) {
			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" "+"\t");
			}
			
			for (int cst = 1; cst <= nst; cst++) {
				if(cst<=(nst+1)/2)
				{
					val++;
				}
				else
				{
					val--;
				}
				System.out.print(val+"\t");
			}
			System.out.println();
			nsp = nsp - 1;
			nst = nst + 2;
			row++;

		}

	}
}
