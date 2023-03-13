public class Enhanced_switch {
    public static void main(String[] args) {

        printDayoftheweek(0);
        printDayoftheweek(1);
        printDayoftheweek(2);
        printDayoftheweek(3);
        printDayoftheweek(4);
        printDayoftheweek(5);
        printDayoftheweek(6);
        printDayoftheweek(7);

    }

    public static void printDayoftheweek(int day) {

            String dayoftheweek = switch (day)
            {
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "Invalid Day";
            };

        System.out.println(day+" = "+dayoftheweek);

    }

}
