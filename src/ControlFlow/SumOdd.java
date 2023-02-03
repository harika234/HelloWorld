package ControlFlow;

public class SumOdd {
    public static void main(String[] args) {
        int a=sumOdd(1,100);
        System.out.println(a);

    }
    public static boolean isOdd(int number){
        if(number<0){
            return false;
        }else if(number % 2 ==1){
            return true;
        }
        return false;
    }
    public static int sumOdd(int start,int end){
        int sum=0;
        if((start<=end) && (start>0) && (end>0)){
            for(int i=start;i<=end;i++){
                if (isOdd(i)==true){
                    sum+=i;
                }
            }

        }
        else{
            return -1;
        }
        return sum;
    }
}
