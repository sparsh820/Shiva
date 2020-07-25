package lecture1;

public class BS {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5};
		int mid=bs(a,3);
		System.out.println(mid);
	}
	public static int bs(int[]a,int item)
	{
		int lo=0;
		int hi=a.length-1;
		while(lo<=hi)
		{
			int mid=(lo+hi)/2;
			if(a[mid]<item)
			{
				lo=mid+1;
			}
			else if(a[mid]>item)
			{
				hi=mid-1;
			}
			else
			{
				return mid;
			}
		}
		
		return -1;
	}
	
}
