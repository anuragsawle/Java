package multithreading;

public class prime_extend extends Thread {
	int num;
	public prime_extend(int n)
	{
		num=n;
	}
	public void run()
	{
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
