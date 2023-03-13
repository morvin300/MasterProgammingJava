public class MethodOverloading {
    public static void main(String[] args) {
//    calc();
//    calc(500);
//    calc(500,"Steve");
        System.out.println("Inches to centimeters = " + convertToCentimeters(20));
        System.out.println("Feet and inches to CM = " + convertToCentimeters(5, 8));
    }

//    public static int calc(int score,String playername) {
//        System.out.println("Player:"+playername+" has Scored="+score);
//        return score*500;
//    }
//    public static int calc(int score) {
//        System.out.println("total Score="+score);
//        return calc(500,"anonymous");
//    }
//    public static int calc() {
//        System.out.println("No player name and no score ");
//        return 0;
//    }
    // CHALLENGE PROGRAM 1
    public static double convertToCentimeters(int Inches) {
// convert inches to cms
        return Inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int Inches) {
//        System.out.println(feet+"Feet"+Inches+"Inches");
        int TotalInches = 0;
        if (feet == 5 && Inches == 8)
//            TotalInches=Inches+(feet*12);
//        System.out.println("Total feet and inches in  CMS="+convertToCentimeters(TotalInches));


            return convertToCentimeters(Inches + (feet * 12));
        return 0;
    }

}
