package KeywordsAndExpressions;

public class CodingChallenge_7 {
    public static void main(String[] args){
        boolean a = areEqualSum(5,6,7);
        System.out.println(a);
    }
    public static boolean areEqualSum(int a,int b,int c){
        if(a+b==c){
            return true;
        }
        return false;
    }
}
