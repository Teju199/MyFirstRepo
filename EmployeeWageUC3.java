public class EmployeeWageUC3 {
    public static void main(String[] args) {
        int is_FULL_TIME = 1;
        int is_PART_TIME = 2;
        int empHours = 0;
        int empRatePerHour = 20;

        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == is_FULL_TIME)
            empHours = 8;

        else if (empCheck == is_PART_TIME)
            empHours = 4;

        int empWage = empHours * empRatePerHour;

        System.out.println("Total Employee wage is " + empWage);

    }
}