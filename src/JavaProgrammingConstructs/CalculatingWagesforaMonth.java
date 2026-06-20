package JavaProgrammingConstructs;

public class CalculatingWagesforaMonth {

    public static void main(String[] args) {

        int EmpRatePerHour = 20;
        int WorkingDays = 20;
        int FULL_DAY_HOURS = 8;

        int monthlyWage = EmpRatePerHour * FULL_DAY_HOURS * WorkingDays;

        System.out.println("Monthly Wage = " + monthlyWage);git
    }

}
