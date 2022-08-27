package GFG;

import java.util.Scanner;

public class Factorial {
    public static int factorialIterative(int n){
        if(n<=0){
            System.out.println("Please enter a positive integer");
            return -1;
        }
        int fact=1;
        for(int i=1;i<=n;i++){
           fact=fact*i;
        }
        return fact;

    }
    public static int factorialRecursive(int n, int fact){
        if(n<0){
            System.out.println("Please enter a positive integer");
            return -1;
        }
        if(n==0){
            return fact;
        }
            fact = fact*n;
         return   factorialRecursive(n-1, fact);

    }

    public static int factorialRecursive(int n){
        if(n<0){
            System.out.println("Please enter a positive integer");
            return -1;
        }
        if(n==0){
            return 1;
        }
        return n*factorialRecursive(n-1);
    }

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Integer ");
        int n= sc.nextInt();

        System.out.println(factorialIterative(n));

        int fact=1;
        System.out.println(factorialRecursive(n, fact));

        System.out.println(factorialRecursive(n));

    }
}
