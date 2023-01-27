package section_3;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        boolean isAlien = false;
        if(isAlien==false) {
            System.out.println("it is not an alien");
            System.out.println("And i am scared of aliens");
        }
        int topScore=80;
        if(topScore<100){
            System.out.println("you got the high score!");
        }
//        LOGICAL AND OPERATOR(&&)
        int SecondTopScore=95;
        if((topScore>SecondTopScore) && (topScore<100)){
            System.out.println("Greater than second top score and less than 100");
        }
//        LOGICAL OR OPERATOR(||)
        if((topScore>90)||(SecondTopScore<=90)){
            System.out.println("Either or both of the conditions are true");
        }
//        ASSIGNEMENT OPERATOR V/S EQUALS TO OPERATOR
        int newValue=50;
        if(newValue==50){
            System.out.println("this is true");
        }
//        NOT OPERATOR
        boolean isCar=false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }
//        TERNARY OPERATOR-CONDITINAL OPERATOR
//        (OPERAND1 ? OPERAND 2 :OPERAND 3)
       String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar =="Volkswagen"? true : false;

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }
        String s = (isDomestic)? "This car is domestic" : "this car is not domestic";
        System.out.println(s);

//        CHALLENGE-1
        double myFirstValue=20.00d;
        double mySecondValue=80.00d;
        double myValuesTotal =  (myFirstValue+mySecondValue) *100.00d;
        System.out.println("myValuesTotal = "+myValuesTotal);
        double theRemainder=myValuesTotal%40.00d;
        System.out.println("theRemainder = "+theRemainder);
        boolean isNoRemainder = (theRemainder==0) ? true : false;
        System.out.println("isNoRemainder = "+isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
