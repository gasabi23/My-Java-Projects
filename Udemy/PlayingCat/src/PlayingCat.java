public class PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature){
        if ((temperature >= 25 && temperature <= 35 && !summer) ||
                (temperature >= 25 && temperature <= 45 && summer)) {
           // System.out.println("true");
            return true;
        }

        else return false;

    }
}
