public class PrimeRange {

    public static void main(String[] args) {

        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter lower range: " );
        int low = myInput.nextInt();
        System.out.print( "Enter upper range: " );
        int high = myInput.nextInt();

        while (low < high) {
            if(checkPrimeNumber(low))
                System.out.print(low + " ");

            ++low;
        }
    }

    public static boolean checkPrimeNumber(int num) {
        boolean flag = true;

        for(int i = 2; i <= num/2; ++i) {

            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}