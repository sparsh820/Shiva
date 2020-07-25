package lecture1;

public class binarytodecimal1 {

	public static void main(String[] args) {
		
		int n=37;
		int temp=n;
		int node=0;
		while(temp>0)
		{
			temp=temp/8;
			node++;
		}
		System.out.println(node);
		int i=0;
		int sum=0;
		while(i<node)
		{
			int rem=n%8;
			int q=(int)Math.pow(10, i);
			sum=sum+rem*q;
			n=n/8;
			i++;
		}
		System.out.println(sum);
		
	}
	
}u777777777777777777777777777777777777777777777777777777777777777777uh
