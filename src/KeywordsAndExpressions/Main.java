package KeywordsAndExpressions;

public class Main {
    public static void main(String[] args){
        double kilometers=(100 * 1.609344);

        int highscore = 50;
        if(highscore > 25){
            highscore=1000+highscore;
        }
        int health=100;
        if((health<25) && (highscore>1000)){
            highscore=highscore-1000;
        }
//        42)Statements WhiteSpace and Indentation
        int myVariable = 50;
        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is"+"another"+" still more.");

    }
}
