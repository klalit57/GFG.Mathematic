package GFG;

import java.util.Scanner;

public class LCM {
    public static int lcm(int a , int b){
        int res= Math.max(a,b);
        while(true){
            if(res%a==0 && res%b==0){
                return res;
            }
            res++;
        }
    }

    public static int hcfOptimised(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return hcfOptimised(b, a % b);
        }
    }

    public static int lcmOptimised(int a,int b){
       int hcf=hcfOptimised(a,b);
       return (a*b)/hcf;
    }


    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two positive integer: ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();

        System.out.println(lcm(n1,n2));

        System.out.println(lcmOptimised(n1,n2));

    }
}
