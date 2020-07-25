package lecture1;

public class GCD {

	public static void main(String[] args) {
		
		int a=24;
		int b=36;
		int GCD=1;
		int c=0;
		if(a>b)
		{
			c=b;
		}
		else
		{
			c=a;
		}
		int i=2;
		while(i<c)
		{
			if(a%i==0 && b%i==0)
			{
				GCD=i;
			}
			
			i++;
		}
		
		System.out.println(GCD);
		
	}
	
}
