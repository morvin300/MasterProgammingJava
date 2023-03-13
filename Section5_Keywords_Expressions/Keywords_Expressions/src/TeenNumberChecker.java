public class TeenNumberChecker {
    public static boolean hasTeen(int firstNum,int secondNum,int thirdNum) {
        return ((firstNum>12&&firstNum<20)||(secondNum>12&&secondNum<20)||(thirdNum>12&&thirdNum<20));
    }
    public static boolean isTeen(int num) {
        return (num>12&&num<20);
    }
}
