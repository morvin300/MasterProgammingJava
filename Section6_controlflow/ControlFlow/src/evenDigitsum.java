public class evenDigitsum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2000));
    }
    public static int getEvenDigitSum(int number)
    {
        if(number<0)
        {
            return -1;
        }
        else
        {
            int lastdigit,sum=0;
            while(number>0)
            {
                lastdigit=number%10;
                if(lastdigit%2==0)
                {
                    sum+=lastdigit;
                }
                number/=10;
            }

//            for(int i=0;i<=number;i++)
//            {
//                if(i%2==0)
//                {
//                    sum+=i;
//                }
//            }
           return sum;
        }
    }
}
//            while(number>=10)
//            {
//
//                if(number%2==0)
//                {
//                    sum+=number;
//                }
//                System.out.println(sum);
//            }