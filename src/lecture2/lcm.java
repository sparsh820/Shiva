package lecture2;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		int min;
		System.out.println("enter the first number");
		Scanner scn= new Scanner(System.in);
		int a = scn.nextInt();
		System.out.println("enter the second number");
		int b = scn.nextInt();
		if(a>b)
		{
			min=a;
		}
		else
		{
			min=b;
		}
		
	
		while(2>1)
		{
			
			if(min%a==0 && min%b==0)
			{
				System.out.println(min);
				break;
				
			}
				min=min+1;
			}
		}

}