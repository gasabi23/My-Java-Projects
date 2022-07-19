
public class FirstLastDigitSum {
        //int number;

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0){
            return -1;
        }

        int lastNumber = number % 10;

        int firstNumber = number;

        while (firstNumber >= 10) {
           firstNumber = firstNumber / 10;
        }

        int sumNumber = lastNumber + firstNumber;
        return sumNumber;
    }
}
