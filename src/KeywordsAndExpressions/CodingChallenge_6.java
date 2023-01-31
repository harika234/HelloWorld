package KeywordsAndExpressions;

public class CodingChallenge_6 {
    public static void main(String[] args) {
        boolean a = areEqualByThreeDecimalPlaces(4.520,8.2);
        System.out.println(a);
    }


    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a = (int) (a * 1000);
        b = (int) (b * 1000);
        if (a == b) {
            return true;
        }
        return false;
    }
}
