
//Euclidean method........................................................
public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int no1, int no2){
        if (no1 < 10 || no2 < 10){
            System.out.println("invalid value");
            return -1;
        }
        if (no1 == 0 || no2 == 0) {
           return 0;
        }
        if (no1 == no2){
            return no1;
        }
        if (no1 > no2){
      return getGreatestCommonDivisor(no1 - no2, no2);
        }
        else {
            return getGreatestCommonDivisor(no1, no2 - no1);
        }

        // another approach -----------------------------------------
//         if (no1 == 0)
//         return no2;
//         return getGreatestCommonDivisor(no2 % no1, no1);

    }


        public static int getGreatestCommonDivisor2(int first, int second) {
            int greatestCommonDivisor = 0;
            if(first < 10 || second < 10)
                return -1;

            for(int i = 1; i <= first; i++)
            {
                if(first % i ==0 && second % i == 0)
                {
                    greatestCommonDivisor = i;
                }
            }

            return greatestCommonDivisor;

        }
}
