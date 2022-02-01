package practice;

public class EmployeeWage {
    public static void main(String[] args) {
        int ispresent = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if ( empcheck == ispresent )
            System.out.print("The Employee is Present");
        else
            System.out.print("The Employee is Absent");
    }
}
