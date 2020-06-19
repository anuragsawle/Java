package multithreading;

public class Deposit implements Runnable {
	 private Account account;
	 private double amount;
	 public Deposit(Account account, double amount) {
	 this.account = account;
	 this.amount = amount;
	 }
	 public void run() {
	 
	 account.deposit(amount);
	 }
	}
