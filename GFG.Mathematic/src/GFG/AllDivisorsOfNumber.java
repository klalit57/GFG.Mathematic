package GFG;
import java.util.Scanner;
import java.util.Stack;

public class AllDivisorsOfNumber {
    public static void allDivisors1(int n){   //Not Efficient
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void allDivisors2(int n){ //Efficient
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
                if(i!=(n/i)) {
                    System.out.print((n / i) + " ");
                }
            }
        }
        System.out.println();
    }

    public static void allDivisors3(int n){ //Efficient
        int i;
        for(i=1;i*i<n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
        for(;i>=1;i--){
            if(n%i==0){
                System.out.print((n / i) + " ");
            }
        }
        System.out.println();
    }

    public static void allDivisors4(int n){    //SortedEfficient
        Stack<Integer> s= new Stack<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
                if(i!=(n/i)) {
                    s.push(n/i);
                }
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two positive integer to which prime number to found: ");
        int n= sc.nextInt();

        allDivisors1(n);

        allDivisors2(n);

        allDivisors3(n);

        allDivisors4(n);

    }
}
