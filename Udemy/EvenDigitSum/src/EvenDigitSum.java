
public class EvenDigitSum {

    public static int getEvenDigitSum (int number){
        if (number < 0) {
            return -1;
        }
        int remainder;
        int sum=0;
        //int newNumber = number;
        while (number > 0){
            remainder = number % 10;
            number /= 10;
        if (remainder % 2 == 0){
            sum = sum + remainder;
        }
        }
        System.out.println("The sum of even number = " + sum);
        return sum;
    }
}
