import java.util.Scanner;

public class PrimeNumbersString {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n : ");
            int n = sc.nextInt();
            int i,j;
            int flag = 0;

                for (i = 2; i < n; i++) {
                    flag = 0;
                    for (j=2; j<=(i/2); j++){
                        if ((i % j) == 0) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println(i + " is the Prime number.");
                    }
            }

        }
    }

