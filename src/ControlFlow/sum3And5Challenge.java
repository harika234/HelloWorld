package ControlFlow;

public class sum3And5Challenge {
    public static void main(String[] args) {
        int countofMatches = 0;
        int sumofMatches = 0;

        for(int loopNumber = 1;loopNumber<=1000;loopNumber++){
            if((loopNumber %3 ==0) && (loopNumber %5 ==0)){
                countofMatches++;
                sumofMatches+=loopNumber;
                System.out.println("Found a match = "+loopNumber);
            }
            if(countofMatches==5){
                break;
            }
        }
        System.out.println("Sum = "+sumofMatches);
    }
}
