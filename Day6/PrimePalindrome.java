import java.util.Scanner;

class PrimePalindrome {
    public static void main(String []args) {
        System.out.print( "Enter number: " ); 
        Scanner myInput = new Scanner( System.in );
        int n = myInput.nextInt();
        primePallindrome(n);
    }

    public static boolean isPallindrome(int n) {
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == n) {
			return true;
		}
		return false;
	}

    public static void primePallindrome(int n) {
        System.out.println();
        boolean b;
        b = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                b = false;
                break;
            }
        }
        if (b && isPallindrome(n))
            System.out.print(n + " is prime as well as palindrome");
        else if (b)
            System.out.print(n + " is prime");
        else if (isPallindrome(n))
            System.out.print(n + " is palindrome");
        else
            System.out.print(n + " is not prime as well as not palindrome");
    }
}