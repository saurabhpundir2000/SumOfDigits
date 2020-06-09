import java.util.Scanner;

public class SumOfDIgit {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int no= sc.nextInt();
        System.out.println("the sum of digits " + SumDigits(no));

    }

    public static int SumDigits(int no){
        if(no <10){
            return -1;
        }

        int sum = 0;
        while (no > 10 ){
            int digit = no %10;
            sum += digit;
            no= no /10;
        }
        return  sum;
    }
}
