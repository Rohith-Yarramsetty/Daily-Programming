public class fibonacci {
    public static void main(String[] args) {
        System.out.println("The series is: ");

        int firstNum = 0, secondNum =1, thirdNum = firstNum + secondNum;
        int seriesEnd = 20, count = 2;
        boolean firstTime = true;

        while(count!=seriesEnd) {
            if(firstTime) {
                System.out.print(firstNum+ " ");
                System.out.print(secondNum+ " ");
                firstTime = false;
            }
            thirdNum =  firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
            System.out.print(thirdNum + " ");
            count++;
        }
    }
}
