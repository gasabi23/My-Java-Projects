import java.sql.SQLOutput;
public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        int tempNumber = number;
        int reverseNumber = 0;
        while (tempNumber != 0) {
          int remainder = tempNumber % 10;
            tempNumber = tempNumber / 10;
          reverseNumber = (reverseNumber * 10) + remainder;
        }
        //return (number == reverseNumber);
       // System.out.println("Is a pallindrome");
        if (number != reverseNumber){
            System.out.println("Not a pallindrome");
            return false;
        }
        else
        {
        System.out.println("Is a pallindrome");
        }
           return true;
    }
}
