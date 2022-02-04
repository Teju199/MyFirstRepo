import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of flips: ");
        int count = sc.nextInt();

        double headCount = 0;
        double tailCount = 0;

        for (int i=1 ; i<count ; i++) {
            double random = Math.random();

            if (random < 0.5)
                tailCount++;
            else
                headCount++;

        }

        System.out.println("Percentage of tails :" + ((tailCount / (headCount + tailCount)) * 100 ));
        System.out.println("Percentage of heads :" + ((headCount / (headCount + tailCount)) * 100 ));
        }

}
