import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("I can tell you the date of the week of any date from 1752 on.");

        for(int x = 0; x > -1; x++) {
            System.out.println("Enter the month.");
            double numMonth = scan.nextDouble();
            System.out.println("Enter the day.");
            double numDay = scan.nextDouble();
            System.out.println("Enter the year.");
            double numYear = scan.nextDouble();

            DayOfWeekCalculations calc = new DayOfWeekCalculations();

            calc.monthDayErrorRule(numMonth, numDay, numYear);


        }
    }

}
