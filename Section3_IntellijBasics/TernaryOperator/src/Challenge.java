public class Challenge {
    public static void main(String[] args) {
    double var1=20.00d;
    double var2=80.00d;
//    var1=var1+var2;
//        System.out.println(var1);
    double result= (var1 + var2) * 100d;
        System.out.println("Result:"+result);
    double rem = result % 40.00d;
        System.out.println("Rem:"+rem);
        boolean isnorem = (rem  == 0) ? true : false;
        System.out.println(isnorem);
    if(!isnorem)
    {
        System.out.println("Hey there i have got some remainder");
    }

    }
}
