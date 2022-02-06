import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int i, sum = 0;

        for (i = 1; i <= n / 2; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }

        if (n == sum) {
            System.out.println("The given number is a perfect number.");
        } else {
            System.out.println("It is not a perfect number");
        }
    }
}
