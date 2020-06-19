package multithreading;

public class Withdraw implements Runnable {
	 private Account account;
	 private double amount;
	 public Withdraw(Account account, double amount) {
	 this.account = account;
	 this.amount = amount;
	 }
	 public void run() {
	 //make a withdraw
	 account.withdraw(amount);
	 }
	}