public class TernaryOps {
    public static void main(String[] args) {
        String makeofcar="Swift";
        boolean isDomestic= makeofcar =="Swift" ? false : true ;
        if (isDomestic)
        {
            System.out.println("This car is domestic to our country");
        }
        String s=(isDomestic) ? "This is domestic" : "this is not domestic";
        System.out.println(s);
    }
}
