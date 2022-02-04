import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int N = sc.nextInt();
        double sum = 0;

        for (int i=1; i<=N; i++){

            System.out.println("1" + "/" + i );
            sum += 1.0/i;

        }

        System.out.println("Sum of the above numbers : " + sum);

    }
}
