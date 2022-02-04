import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int i;
        int sum = 0;

        for (i=1; i<n; i++) {
            System.out.println("2^" + i);
            sum += Math.pow(2,i);
        }

        System.out.println("Sum of the above factors : " + sum);
    }
}
