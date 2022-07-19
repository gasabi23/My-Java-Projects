
public class LastDigitChecker {

    public static boolean hasSameLastDigit (int number1, int number2, int number3){

        if ((number1 >= 10 && number1 <= 1000) && (number2 >= 10 && number2 <= 1000) &&
                (number3 >= 10 && number3 <= 1000)){
            return ((number1 % 10 == number2 % 10) || (number1 % 10 == number3 % 10) ||
                    (number2 % 10 == number3 % 10));
        }
        return false;
    }

    public static boolean isValid (int number){
        if (number >= 10 && number <= 1000){
        return true;
        } else return false;
    }
}
