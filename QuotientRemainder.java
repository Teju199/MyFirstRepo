import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a, b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a/b;
        System.out.println("Quotient is " + c);

        int d = a%b;
        System.out.println("Remainder is " + d);
    }
}
