public class DecimalComparator {
//    public static void main(String[] args) {
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(areEqualByThreeDecimalPlaces(3.142d,3.143d));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.176));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
//    }
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2) {
        int num3=(int)(num1*1000);
        int num4=(int)(num2*1000);
        return (num3==num4) ? true : false ;
    }
}
