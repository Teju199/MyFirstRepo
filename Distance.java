import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y : ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x,x)+Math.pow(y,y));
        System.out.println("Distance is : " + distance);
    }
}
