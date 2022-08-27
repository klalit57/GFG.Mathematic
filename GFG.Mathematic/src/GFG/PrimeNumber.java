package GFG;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime1(int n){ //Not efficient
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    static boolean isPrime2(int n){  //efficient
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0||n%3==0){
            return false;
        }
        for(int i=5;i*i<n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
       return true;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two positive integer to which prime number to found: ");
        int n= sc.nextInt();

        System.out.println(isPrime1(n));

        System.out.println(isPrime2(n));
    }
}
