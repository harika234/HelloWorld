package KeywordsAndExpressions;

public class MethodOverloadingChallenge {
    public static void main(String[] args){
        System.out.println("5ft, 8in = "+convertToCentimeters(5,8)+"cm");
        System.out.println("68in = "+convertToCentimeters(68)+"cm");
    }

    public static double convertToCentimeters(int inches){
        return 2.54*inches;
    }
    public static double convertToCentimeters(int feet,int inches){
//        return convertToCentimeters((feet*12)+inches);
        int feetToInches = feet *12;
        int totalInches = feetToInches+inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }


}
