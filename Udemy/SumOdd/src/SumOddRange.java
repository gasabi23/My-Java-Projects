
public class SumOddRange {

    public static boolean isOdd (int number){

        return(number > 0 && number % 2 != 0);
        // Alternative way
       /* if(number <= 0) {
            return false;
        }
        if (number % 2 == 0){
            return false;
        } else {
            return true;
        }*/
    }

    //Method to sum odd number between given range

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end>=start) && (start > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i))
                    sum += i;
                }
            return sum;
            }
        return -1;
        }

}
