package lecture1;

public class primefactors {
	
	public static void main(String[] args) {
		
		PF(28,2);
	}
	
	public static void PF(int n,int i)
	{
		if(n==1)
		{
			return;
		}
		
		if(n%i==0)
		{
			System.out.println(i);
			n=n/i;
		}
		else
		{
			i++;
			
		}
		
		PF(n,i);
	}

}
