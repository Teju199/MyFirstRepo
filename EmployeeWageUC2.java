public class EmployeeWageUC2 {
    public static void main(String[] args) {
        int is_FULL_TIME = 1;
        int ratePerHour = 20;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        int empHours = 0;

        if (empCheck == is_FULL_TIME) {
            empHours = 8;
        }


        int employeeWage = empHours * ratePerHour;
        System.out.print("The total employee Wage is " + employeeWage);

    }
}
