public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(false, 25));
        System.out.println(isCatPlaying(true, 46));

    }
    public static boolean isCatPlaying(boolean isSummer,int temp)
    {
        return temp>=25 && temp<=35 && !isSummer || temp>=25 && temp<=45 && isSummer;
    }
}


//        if((temp>=25 && temp<=45)&& (isSummer))
//            {
//                return true;
//            }
//            else if ((temp >= 25 && temp <= 35) && (!isSummer))
//            {
//                return true;
//            }
//        return false;
//        return (temp >= 25 && temp <= 35);