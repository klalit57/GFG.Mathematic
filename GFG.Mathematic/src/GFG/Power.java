package GFG;

import java.util.Scanner;

public class Power {
    public static int pow1(int x, int n){  //Naive approach
        int res=1;
        if(n==0){
            return 1;
        }
        while(n>=1){ //with while loop
            res=res*x;
            n--;
        }
        return res;
    }

    public static int pow2(int x, int n){  //Naive approach
        int res=1;
        for(int i=0;i<n;i++){ //with for loop
            res=res*x;
        }
        return res;
    }
    public static int pow3(int x, int n){  //O(logn) efficient
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return pow3(x,n/2)*pow3(x,n/2);
        }else{
            return pow3(x,n/2)*pow3(x,n/2)*x;
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base: ");
        int x= sc.nextInt();
        System.out.println("Enter power: ");
        int n= sc.nextInt();

        System.out.println(pow1(x,n));

        System.out.println(pow2(x,n));

        System.out.println(pow3(x,n));
    }
}
