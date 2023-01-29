package KeywordsAndExpressions;

public class CodingChallenge_1 {
    public static void main(String[] args){
        checkNumber(0);
    }
    public static void checkNumber(int parameterNumber){
        if(parameterNumber>0){
            System.out.println("positive");
        }else if(parameterNumber<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }

    }
}
