package KeywordsAndExpressions;

public class CodingChallenge_4 {
    public static void main(String[] args){
        boolean a = shouldWakeUp(true,12);
        System.out.println(a);

    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23){
            return false;
        }
        if(hourOfDay<8 || hourOfDay>22){
            return true;
        }

        return false;
    }
}



