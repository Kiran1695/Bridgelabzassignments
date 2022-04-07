public class Gambler {

    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]); // gambler's stating bankroll
        int goal = Integer.parseInt(args[1]); // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]); // number of trials to perform

        int bets = 0; // total number of bets made
        int wins = 0; // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {
            int cash = stake;
            int star = 0;

            while ((cash > 0) && (cash < goal)) {
                bets++;

                if (Math.random() < 0.5) {
                    cash++; // win $1
                }
                else {  
                    cash--; // lose $1
                }

                while (star <= cash) {
                        star++;
                        System.out.print("*");
                }

                System.out.println();
            }

            if (cash == goal)
                wins++; 
        }
        System.out.println(wins);
    }
}

