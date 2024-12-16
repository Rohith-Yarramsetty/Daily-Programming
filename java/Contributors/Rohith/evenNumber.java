public class evenNumber {

    public static void main(String[] args){
        verifyTheNumberIsAnEvenNumber();

    }

    static void verifyTheNumberIsAnEvenNumber(){
        int num = 1843;
        if(num%2==0)
            System.out.println(num + " is even number");
        else
            System.out.println(num + " is odd number");
    }

}