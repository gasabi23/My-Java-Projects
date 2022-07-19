public class LeapYearCalculator {

    public static boolean isLeapYear (int year) {
        if ((year < 1 ) || (year > 9999)) {
            System.out.println("Invalid Value");
            return false;
        } else if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year!!");
            return true;
        } else {
            System.out.println("Not a leap Year!");
            return false;
        }

    }
}
