
public class CoinFlip {
	public static void main(String[] args) {
		try {
			int head = 0;
            int tail = 0;
			while (head < 11 && tail < 11) {
				double random_num = Math.random();
				if (random_num < 0.5) {
					head++;
				} else {
                    tail++;
                }
			}
			System.out.println("HEADS:" + head);
			System.out.println("TAILS:" + tail);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}