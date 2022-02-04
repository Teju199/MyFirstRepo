import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int n = sc.nextInt();
        int flag = 0;

        if (n%4==0){
            flag = 0;
        }
            if(n%100 == 0){

                if((n%400) == 0){

                    System.out.println("It is a Leap year.");
                }

            else{
                    System.out.println("It is not a leap year.");
                    flag = 1;
                }

            }

        if (flag == 0){
            System.out.println("It is a Leap year.");
        }
    }
}
