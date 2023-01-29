package KeywordsAndExpressions;

public class methodChallenge {
    public static void main(String[] args) {
        int highScorePosition = calcuateHighScorePosition(1500);
        displayHighScorePosition("harika",highScorePosition);

        highScorePosition = calcuateHighScorePosition(1000);
        displayHighScorePosition("booster",highScorePosition);

        highScorePosition = calcuateHighScorePosition(500);
        displayHighScorePosition("kc",highScorePosition);

        highScorePosition = calcuateHighScorePosition(25);
        displayHighScorePosition("chaitanya",highScorePosition);
    }
    public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName + "  to get into position "+highScorePosition +" on the high score list");

    }
    public static int calcuateHighScorePosition(int playerScore){
        int position=0;

        if(playerScore>=1000){
            position =1;
        }else if(playerScore>=500  ){
            position= 2;
        }else if(playerScore>=100 ){
            position= 3;
        }else{
            position=4;
        }
        return position;
    }
}
