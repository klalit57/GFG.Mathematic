package GFG;

import java.util.Scanner;

public class PrimeFactor {

    static boolean isPrime(int n){  //efficient
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0||n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void primeFactor1(int n){  //Not efficient
        if(n==1){
            System.out.println("Not Prime");
             return;
        }
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                int x=i;
               while(n%x==0){
                   System.out.print(i+",");
                   x=x*i;
               }
            }
        }
        System.out.println();
    }

    public static void primeFactor2(int n){  // efficient
        if(n<=1){
            return;
        }
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                    System.out.print(i+",");
                    n=n/i;
            }
        }
        if (n>1){
            System.out.print(n);
        }
        System.out.println();
    }

    public static void primeFactor3(int n){  // efficient
        if(n<=1){
            return;
        }
        while(n%2==0){
            System.out.print("2,");
            n=n/2;
        }

        while(n%3==0){
            System.out.print("3,");
            n=n/3;
        }
        for(int i=5;i*i<=n;i=i+6) {
            if(n%i==0){
                System.out.print(i+",");
                n=n/i;
            }
            if(n%(i+2)==0){
                System.out.print(","+(i+2));
                n=n/(i+2);
            }
        }
        if(n>3) {
            System.out.println(n);
        }
        System.out.println();
    }

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two positive integer to which prime number to found: ");
        int n= sc.nextInt();

        primeFactor1(n);

        primeFactor2(n);

        primeFactor3(n);



    }
}
