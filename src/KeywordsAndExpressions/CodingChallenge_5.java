package KeywordsAndExpressions;

public class CodingChallenge_5 {
    public static void main(String[] args) {
        boolean a = isLeapYear(2020);
        System.out.println(a);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 || year <= 99999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }

                }
            }
        }
        return false;
    }
}