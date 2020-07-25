package lecture1;

public class LCM {

public static void main(String[] args) {
	
	int a=36;
	int b=24;
	int c=a*b;
	int n=1;
	int LCM=0;
	if(b>a)
	{
		n=b;
	}
	else
	{
		n=a;
	}
	while(c>=n)
	{
		if(c%a==0 && c%b==0)
		{
			LCM=c;
		}
		
		c--;
	}
	
	System.out.println(LCM);
	
}	
	
}
