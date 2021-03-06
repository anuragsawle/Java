package multithreading;


public class Account {
 private double balance = 0;
 public Account(double balance) {
 this.balance = balance;
 }
 // if �synchronized� is removed, the outcome is unpredictable
 public synchronized void deposit(double amount) {
 if (amount < 0) {
 throw new IllegalArgumentException("Can�t deposit");
 }
 this.balance += amount;
 System.out.println("Deposit Amount Rs"+amount+" In My Account (with thread "+Thread.currentThread().getId()+"),Current balance is " +balance);
 }
 // if �synchronized� is removed, the outcome is unpredictable
 public synchronized void withdraw(double amount) {
 if (amount < 0 || amount > this.balance) {
 throw new IllegalArgumentException("Can�t withdraw");
 }
 this.balance -= amount;
 System.out.println("Withdraw Amount Rs"+amount+" In My Account (with thread "+ Thread.currentThread().getId()+ "),Current balance is "+balance);
 }
}
