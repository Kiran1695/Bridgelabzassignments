import java.util.Scanner;


public class PrimeFactor {

    public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i== 0) {
				return false;
			}
		}
		return true;
	}

	static void primeFactors(int n) {
		for (int i = 2; i <= n; i++) {
			int t = n % i;
			if (t == 0) {
				if (isPrime(i))
					System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
		System.out.println("enter no to find prime factors");
		int n = myInput.nextInt();
		System.out.println("prime factors are ");
		primeFactors(n);
		myInput.close();
	}
}