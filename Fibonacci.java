import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int num1=0, num2=1;
        System.out.print(num1+" "+num2);
        int sum=0;
        while (true) {
            sum = num1 + num2;
            if(sum > 10)
                break;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;

        }
    }
}
