package GFG;

import java.util.Scanner;

public class IterativePower {
    public static int iterativePower(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res * x;
            }
            x = x * x;
            n = n / 2;
        }
        return res;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base: ");
        int x= sc.nextInt();
        System.out.println("Enter power: ");
        int n= sc.nextInt();

        System.out.println(iterativePower(x,n));

    }
}
