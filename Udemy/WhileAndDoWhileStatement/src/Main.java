public class Main {

    public static void main(String[] args) {
        int count = 0;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("--------------------------------------");

        // For Loop below is Identical to while loop above
        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }
    // DO WHILE LOOP
        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

    // XXXXX DO LOOP
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not
        // return true if an even number, otherwise return false;
    }
//    public static boolean isEvenNumber(int number){
//        //return (number % 2 ==0 );
//        if (number % 2 == 0){
//            return true;
//        } else {
//            return false;
//        }
//    }
}
