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

        System.out.println("This is"+
                " another"+
                " still more.");
        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable=" + myVariable);
        if(myVariable==0){
            System.out.println("It's now zero");
        }


        //43)CODE BLOCKS AND IF-ELSE STATEMENT


        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;

        if(score<5000&&score>1000){
            System.out.println("your score is less than 5000 but greater than 1000");
        }
        else if(score<1000){
            System.out.println("Your score was less than 1000");
        }
        else{
            System.out.println("Got here");
        }






    }
}
