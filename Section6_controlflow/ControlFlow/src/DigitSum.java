public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
        System.out.println(sumDigits(1000));
    }
    public static int sumDigits (int number) {

        int sum = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 100) {
            sum += number % 10;
            number /= 10;
        }
        sum+=number;
        return sum;
    }
}
