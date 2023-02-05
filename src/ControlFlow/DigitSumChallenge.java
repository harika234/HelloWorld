package ControlFlow;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of digits in number 1234 is "+sumDigits(1234));
        System.out.println("The sum of digits in number 1234 is "+sumDigits(-124));
        System.out.println("The sum of digits in number 1234 is "+sumDigits(4));
        System.out.println("The sum of digits in number 1234 is "+sumDigits(32123));

    }
    public static int sumDigits(int number){
        int sum=0;
        if(number<0){
            return -1;
        }
        while(number>9){
            sum+=(number%10);
            number=number/10;
        }
        sum+=number;
        return sum;

    }
}
