package multithreading;

public class primecheck {
	public static void main(String[] args) {
		check_prime p = new check_prime(5);
		check_prime p1 = new check_prime(87);
		check_prime p2 = new check_prime(67);
		Thread t = new Thread(p);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		prime_extend pc = new prime_extend(6);
		prime_extend pc1 = new prime_extend(54);
		prime_extend pc2 = new prime_extend(29);
		t.start();
		pc.start();
		t1.start();
		pc1.start();
		t2.start();
		pc2.start();
	}
}
