package lecture4;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int q=0;
		int m=10;
		int i=0;
		int sum=0;
		int temp=x;
		while(temp>0) {
			temp=temp/10;
			i++;
			
		}
		System.out.println(i);
		int node=0;
		while(node<i)
		{
			int rem=x%10;
			if(rem>=5)
			{
			rem=9-rem;
			}
			q=rem*(int)Math.pow(m, node);
			x=x/10;
			sum=sum+q;
			node++;
			
			
		}
				
		
		System.out.println(sum);

	}

}
