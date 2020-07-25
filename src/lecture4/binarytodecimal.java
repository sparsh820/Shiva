package lecture4;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
      
		 Scanner scn=new Scanner(System.in);
		 int n=scn.nextInt();
		 int m=2;
		 int i=0;
		 int sum=0;
		 for(int a=0;a<n;a++)
		 {
			 int w=scn.nextInt(); 
			 i=0;
			 sum=0;
		    while(w>0)
		 {
			 int rem=w%10;
             int q=rem*(int)Math.pow(m,i);	
             sum=sum+q;
             i++;
             w=w/10;
			
		 }
		 System.out.println(sum);
		 }
	}

}
