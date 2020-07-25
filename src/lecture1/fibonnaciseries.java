package lecture1;

import java.util.Scanner;

public class fibonnaciseries {

	public static void main(String[] args) {
		int i = 0, j = 1, sum = 0, count = 0;
		System.out.println("enter the nth term");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (count <= n+1) {
			
			System.out.print(i+"\t");
			sum = i + j;
			i = j;
			j = sum;
			count = count + 1;
		}
		System.out.println();
		System.out.println(sum);

	}
}
