public class Main {
    public static void main(String[] args) {
        byte myByteNumber = 10;
        short myShortNumber = 20;
        int myIntNumber = 50;
        long myLongNumber = 50000L + 10L*(myByteNumber + myShortNumber + myIntNumber);
        System.out.println("my long number = " + myLongNumber);

        short myShotTotal = (short)(1000 + 10*(myByteNumber + myShortNumber + myIntNumber));
        System.out.println(myShotTotal);

    }
}