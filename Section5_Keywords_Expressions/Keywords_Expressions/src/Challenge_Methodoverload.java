public class Challenge_Methodoverload {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65,-45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,35));
    }
    public static String getDurationString(int seconds) {

        return seconds>=0 ? getDurationString(seconds/60,seconds%60) : "Please pass valid values ";
    }
    public static String getDurationString(int minutes,int seconds) //65,3945
    {
    int hours;
    if(minutes>=0 && (seconds>0 && seconds<=59)) {
        hours= minutes/60;//65/60
        int remminutes = (minutes % 60);//65%60
        return hours + "H " + remminutes + "M " + seconds + "S";
    }
    else
        return "Please pass valid values " + seconds +"minutes" + minutes;
    }

}

