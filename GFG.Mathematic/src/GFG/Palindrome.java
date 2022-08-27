package GFG;

import java.util.Scanner;

public class Palindrome {

    public static boolean palindrome1(int n){
        if(n<=0){
            return false;
        }
        int t=n;
        int r=0;
        while(t!=0){
            r= r*10+(t%10);
            t=t/10;
        }
            return (r==n);
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Integer ");
        int n= sc.nextInt();
        System.out.println(palindrome1(n));


    }
}
