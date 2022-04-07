public class PowerOfTwo {
	public static void main(String[] args) {
		try {
			System.out.println("Enter number: ");
			int n = 0;
			n = Integer.parseInt(args[0]); //command line args

            int i = 0; 
            int two_power = 1; 

            while (i <= n) {
                System.out.println(i + " " + two_power); 
                two_power = 2 * two_power; 
                i = i + 1;
            }
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}