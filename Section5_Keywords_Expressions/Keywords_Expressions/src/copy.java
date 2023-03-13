public class copy {
    public static void main(String[] args)
    {
        boolean gameover= true;
        int score=10000;
        int levelcompleted=8;
        int bonus =200;
        int finalscore=score;

        mymethod(true,20000);

//        int finalscore=score;
//
        if(gameover)
        {
            finalscore +=(levelcompleted*bonus);
            System.out.println("Your final score "+finalscore);
        }
    }
    public static void mymethod(boolean gameover,int score){
//        boolean gameover= true;
//        int score=20000;
        int levelcompleted=8;
        int bonus =200;
        int finalscore=score;
        if(gameover)
        {
            finalscore +=(levelcompleted*bonus);
            System.out.println("Your final score "+finalscore);
        }
    }
}