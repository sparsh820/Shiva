package lecture3;

public class rotate {
	public static void main(String[] args) {

		int n = 12345;
		int rem;
		int rot= 1;
		int ans = 0;
		int i=0;
		int temp=n;
		while(temp>0)
		{
			temp=temp/10;
			i++;
		}
		
		System.out.println(i);
		rot=rot%i;
		if(rot<0)
		{
			rot=rot+5;
		}
		while (rot< 2) {                                                               //2 is number of rotation
			rem = n% 10;
			n= n / 10;

			int power = (int) (Math.pow(10, i-1)) * rem;
			ans = power + n;
			n = ans;
			rot = rot+ 1;

		}
		System.out.println(ans);
	}
}
