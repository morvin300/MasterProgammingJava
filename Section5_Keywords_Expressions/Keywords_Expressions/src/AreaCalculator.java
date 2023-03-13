public class AreaCalculator {
//    public static void main(String[] args) {
//        System.out.println(area(5.0));
//        System.out.println(area(-1));
//        System.out.println(area(5,4));
//        System.out.println(area(-1,4));
//    }

    public static double area(double radius) {
        return radius < 0 ? -1.0 : Math.PI * radius * radius;
    }
    public static double area(double x,double y)
    {
       //X AND Y represents sides of rectangle
        // Return area of rectangle in this method
            return x<0 || y<0 ? -1.0 : x * y;
    }
}
