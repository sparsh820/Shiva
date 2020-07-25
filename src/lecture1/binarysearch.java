package lecture1;

public class binarysearch {

	int[]a= {1,2,3,4,5};
	
	int low=0;
	int high=a.length-1;
	int target=3;
	while(low<=high)
	{
		int mid=low+high/2;
		if(a[mid]>target)
		{
			high=mid-1;
		}
		else if(a[mid]<target)
		{
			low=mid+1;
		}
		else if(a[mid]==target)
		{
			System.out.println("elemet is"+ mid);
		}
	
		
	}
	
}
}
