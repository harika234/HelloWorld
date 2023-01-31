package KeywordsAndExpressions;

public class CodingChallenge_8 {
    public static void main(String[] args) {
        boolean a = hasTeen(5,14,2);
        boolean b = isTeen(8);
        System.out.println(a);
        System.out.println(b);
    }
    public static boolean hasTeen(int a ,int b , int c){
        if(a>=13 && a<=19){
            return true;
        }if(b>=13 && b<=19){
            return true;
        }if(c>=13 && c<=19){
            return true;
        }
        return false;
    }
    public static boolean isTeen(int a){
        if(a>=13 && a<=19){
            return true;
        }
        return false;
    }
}
