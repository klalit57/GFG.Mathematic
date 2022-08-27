package GFG;
import java.util.Scanner;
import java.lang.Math;


public class CountDigit {
    public static int countDigitIterative(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static int countDigitRecursive(int n){
        if(n==0){
            return 0;
        }
      return 1+countDigitRecursive(n/10);
    }

    public static double countDigitLog(int n){
        return (Math.log10(n)+1);
    }



    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Integer ");
        int n= sc.nextInt();
        int d1= countDigitIterative(n);
        System.out.println(d1);

        int d2= countDigitRecursive(n);
        System.out.println(d2);

        int d3= (int)countDigitLog(n);
        System.out.println(d3);
    }
}
