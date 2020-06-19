package multithreading;



public class check_prime implements Runnable{
	
	int num;
	public check_prime(int n)
	{
		num=n;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int f=0;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0) {
				f=1;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}
