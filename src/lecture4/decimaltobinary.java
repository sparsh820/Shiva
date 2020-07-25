package lecture4;

public class decimaltobinary {

	public static void main(String[] args) {
		
		int n=37;
		while(n>=0)
		{
			int rem=n%10;
			System.out.print(rem+" ");
			n=n/10;
			
		}
	}
	
	
}


