public class Methods {
    public static void main(String[] args)
    {
        boolean gameover= true;
        int score=10000;
        int levelcompleted=8;
        int bonus =200;
//        int finalscore=score;
//        mymethod(gameover,score,levelcompleted,score);
        boolean highscore= mymethod(gameover,score,levelcompleted,score);
        System.out.println("highscore is "+mymethod(gameover,score,levelcompleted,score));

        gameover=true;
        score=10;
        levelcompleted=4;
        bonus =300;
        mymethod(gameover,score,levelcompleted,score);
//        int finalscore=score;
//
//        if(gameover)
//        {
//            finalscore +=(levelcompleted*bonus);
//            System.out.println("Your final score "+finalscore);
//        }
    }
    public static boolean mymethod(boolean gameover,int score,int levelcompleted,int bonus)
    {
//        boolean gameover= true;
//        int score=20000;
        levelcompleted=8;
        bonus =200;
        int finalscore=score;
        if(gameover)
        {
            finalscore +=(levelcompleted*bonus);

            System.out.println("Your final score "+finalscore);
        }
        return true;
    }

}
