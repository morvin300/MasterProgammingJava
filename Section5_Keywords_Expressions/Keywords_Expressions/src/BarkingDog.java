public class BarkingDog {
//    public static void main(String[] args) {
//        System.out.println(shouldWakeUp(true, 1));
//        System.out.println(shouldWakeUp(false, 2));
//        System.out.println(shouldWakeUp(true, 8));
//        System.out.println( shouldWakeUp(true, -1));
//    }

    //    We need to wake up if the dog is barking at night
//    isBarking = true
//    isNight = true
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//        We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
//        In all other cases return false.
            if ((barking == false) || ((hourOfDay >= 8) && (hourOfDay <= 22)) || hourOfDay<0 || hourOfDay>23)
            {
               return false;
            }
            return true;

    }
}
