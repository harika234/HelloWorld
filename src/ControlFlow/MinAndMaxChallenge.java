package ControlFlow;

import java.util.Scanner;
public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int loopCount=0;
        while(true){
            System.out.println("Enter a number, or any character to exit:");
            String nextEntry = sc.nextLine();
            try{
               double validnum = Double.parseDouble(nextEntry);
                if(loopCount ==0 || validnum<min){
                    min = validnum;
                }
                if(loopCount ==0 || validnum>max){
                    max = validnum;
                }
                loopCount++;
            }catch (NumberFormatException nfe){
                break;
            }
        }
        if(loopCount>0){
            System.out.println("min = "+min+", max = "+max);
        }else{
            System.out.println("No valid data entered");
        }

    }

}
