package KeywordsAndExpressions;

public class CatPlaying_CodingChallenge_11 {
    public static void main(String[] args) {
        boolean a = isCatPlaying(true,35);
        System.out.println(a);
    }
    public static boolean isCatPlaying(boolean summer,int temperature){
        if(!summer && temperature>=25&& temperature<=35){
            return true;
        }
        return false;
    }
}
