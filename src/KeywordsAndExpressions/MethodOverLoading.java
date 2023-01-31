package KeywordsAndExpressions;

public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("harika",500));
        System.out.println("New score is"+calculateScore(10));
    }
    public static int calculateScore(String playerName,int score){
        System.out.println("player "+playerName+"scored "+score +" points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        return calculateScore("Anonymous",score);
    }
    public static int calculateScore(){
        System.out.println(" no player name ,no player scored ");
        return 0;
    }
}
