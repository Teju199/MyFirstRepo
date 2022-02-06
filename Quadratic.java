import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c : ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double m = Math.sqrt((Math.pow(b,b)-(4*a*c)));
        System.out.println("The 1st root of the quadratic equation is : " +  (-b+m)/(2*a));
        System.out.println("The 2nd root of the quadratic equation is : " + (-b-m)/(2*a));
    }
}
