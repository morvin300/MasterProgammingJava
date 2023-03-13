public class SpeedConverter {
    public static void main(String[] args) {
        double KmToMiles= toMilesPerHour(1.5);
        System.out.println("Miles to Kilometer value:"+KmToMiles);
        KmToMiles= toMilesPerHour(10.25);
        System.out.println("Miles to Kilometer value:"+KmToMiles);
        KmToMiles= toMilesPerHour(-5.6);
        System.out.println("Miles to Kilometer value:"+KmToMiles);
        KmToMiles= toMilesPerHour(25.42);
        System.out.println("Miles to Kilometer value:"+KmToMiles);
        KmToMiles= toMilesPerHour(75.114);
        System.out.println("Miles to Kilometer value:"+KmToMiles);

// Prints conversion

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);



    }

    public static double toMilesPerHour(double kilometersPerHour){
        long calculation= Math.round(kilometersPerHour/1.60934);
        int negative=-1;
        double finalv= (kilometersPerHour<0) ? negative : calculation;
//        if(kilometersPerHour<0)
//        {
//            return -1;
//        } else {
//            return  calculation;
//        }
        return  finalv;

    }

    public static void printConversion(double kilometersPerHour) {

        System.out.println(kilometersPerHour <0 ?"Invalid Value " : + kilometersPerHour +" km/h "+toMilesPerHour(kilometersPerHour) +" mi/h ");
    }
}
