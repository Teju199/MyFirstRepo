import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value i : ");
        int i = sc.nextInt();
        System.out.println("Enter the value of j : ");
        int j = sc.nextInt();

        System.out.println("The value of i and j as input : " + i + " " + j);

        int temp = i;
        i = j;
        j = temp;

        System.out.println("The value of i and j after swapping : " +  i  + " " + j );
    }
}
