package lecture2;

public class pattern32 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int val=1;
		while (row <= 2 * n - 1) {
			for (int cst = 1; cst <= nst; cst++) {
				if(cst%2==0)
				{
				System.out.print("*");
				}
			
				else
				{
					System.out.print(val);
				}
				
				}
			System.out.println();

			if (row <= n - 1)
			{
				nst = nst + 2;
				val=val+1;
			}	
			else
			{	
				nst = nst - 2;
				val=val-1;
			}
			row = row + 1;
		}

	}

}
