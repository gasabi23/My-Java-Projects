public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes){
        if (minutes < 0 ){
            System.out.println("Invalid Value");
        } else {
        long year = minutes/(24 * 60 * 365);
        long remainderMinutes = minutes % (24 * 60 * 365);
        long days = remainderMinutes/(24 * 60);
        long newRemainderMinutes = remainderMinutes % (24 *60);

        System.out.println(minutes + " min = " + year + " y and " + days + " d and " + newRemainderMinutes + " m" );
        }
    }
}
