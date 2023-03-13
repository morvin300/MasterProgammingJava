public class AllFactors {
    public static void main(String[] args) {
    printFactors(6);
        printFactors(32);
        printFactors(-1);
        recursive(4);
        System.out.println(factor(9));
    }
//    Straight forward approach
    public static void printFactors(int number)
    {
        if(number<1)
        {
            System.out.println("Invalid Value");
        } else {
            System.out.println("Factors of " + number + ": ");
            int i=1;
            while(i<=number) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
        }
        // Recursive Method
    public static int fact(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * fact(number-1);
        }
    }

    public static void recursive(int number) {
        System.out.println(fact(number));
    }
    public static int factor(int number) {
        int result = 1;
        while (number > 0) {
            result *= number;
            number--;
        }
        return result;
    }

}
