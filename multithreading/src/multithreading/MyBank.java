package multithreading;

public class MyBank {
public static void main(String [] args ) 
{ 
	
	System.out.println("Welcome to My bank(Initial Amount is Rs1000)");
	System.out.println("doing withdraw and deposit simultaneously with different threads");
	System.out.println("---------------xxxx---------------------------");
    Account accountObject = new Account(1000);
    new Thread(new Deposit(accountObject,500)).start();
    new Thread(new Deposit(accountObject,300)).start();
    new Thread(new Withdraw(accountObject,530)).start();
    new Thread(new Withdraw(accountObject,500)).start();
 
} 
}