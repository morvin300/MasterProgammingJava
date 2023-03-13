public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-200);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(2000);
        printMegaBytesAndKiloBytes(3048);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//        it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
        int megaBytes=(kiloBytes/1024);
        int remkiloBytes=kiloBytes%1024;
        System.out.println(kiloBytes<0 ? "Invalid value " : kiloBytes +"KB ="+megaBytes+" MB and "+remkiloBytes+" KB ");
//        Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

    }
}
