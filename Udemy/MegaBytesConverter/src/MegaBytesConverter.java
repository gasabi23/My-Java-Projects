public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
           int megaByte = (kiloBytes/1024);
           int remKiloBytes = (kiloBytes % 1024);
            System.out.println(kiloBytes + "KB = " +megaByte + "MB and " + remKiloBytes + "KB");
        }
    }
}
