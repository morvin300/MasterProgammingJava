public class MinToYearsAndDays {
        public static void main(String[] args) {
        printYearsAndDays(-525600);
        printYearsAndDays(561600);

    }
    public static void printYearsAndDays(long minutes) {
        if (minutes<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            double year;
            int years=(int)((minutes/60)/24/365);
            int days=(int)(((minutes/60)/24)%365);
            System.out.println(minutes + " min = "+ years +" y and "+ days +"d");
        }
    }
}

//needs to calculate the years and days

//            if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".


