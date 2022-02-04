import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is the Largest number");
        }
            else if (b > a && b > c) {
                System.out.println(b + " is the Largest number");
        }
            else {
                System.out.println(c + " is the Largest number");
        }
        System.out.println("Output using different method : " + Math.max(Math.max(a,b),c));

    }
}
