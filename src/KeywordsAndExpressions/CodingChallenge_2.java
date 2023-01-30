package KeywordsAndExpressions;

public class CodingChallenge_2 {
    public static void main(String[] args) {

        printConversion(96.25);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);

    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        } else{
            long milesPerHours=toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = "+ milesPerHours +" mi/h");
        }
    }
}
