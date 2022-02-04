import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i;
        int flag = 0;
        int p = n/2;

        if ((n == 0) || (n == 1)) {
            flag = 1;
            System.out.print(n + " is not the Prime number.");
        }

        else {

            for (i = 2; i <= p; ++i) {

                if ((n % i) == 0) {
                    flag = 2;
                    System.out.println(n + " is not the Prime number.");
                    break;
                }
            }
        }

        if (flag == 0) {
            System.out.println(n + " is the Prime number.");
        }
    }
}


