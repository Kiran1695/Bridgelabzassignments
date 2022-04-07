
public class Harmonic {
	/*
	 * The main function is written to test Harmonic class
	 */
	public static void main(String[] args) {
		float sum = 0;
		try {
			int n = Integer.parseInt(args[0]); //command line args
			for (int i = 1; i <= n; i++) {
				sum = sum + (float) 1 / i;
				System.out.println(sum);
			}
		} catch (Exception e) {
			System.out.println(e + " \n enter commond line arguments");
		}
	}
}