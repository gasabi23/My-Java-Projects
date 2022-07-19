
public class SharedDigit {
    public static boolean hasSharedDigit (int number1, int number2){


        if (((number1 < 10) || (number1 > 99)) || ((number2 < 10) || (number2 > 99)))
           {
           return false;
               }
        int  firstNumber1;
        int lastNumber1;
        int firstNumber2;
        int lastNumber2;
            // *********to use while loop remove all comments*********************************
           // while(number1 > 0 && number2 > 0){
               lastNumber1 = number1 % 10;
                firstNumber1 = number1 / 10;

              lastNumber2 = number2 % 10;
                firstNumber2 = number2 / 10;

                if((lastNumber1 == lastNumber2) || (lastNumber1 == firstNumber2)
                        ||(firstNumber1 == firstNumber2) || (firstNumber1 == lastNumber2)){
                    return true;
                } //else return false;
            //}

        return false;
    }
}
