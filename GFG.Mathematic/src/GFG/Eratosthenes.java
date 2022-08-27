package GFG;
import java.util.Scanner;
import java.util.Arrays;

public class Eratosthenes {
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

    public static void allPrime1(int n){ //Naive approach
        if(n==1)
            System.out.println("No prime number");
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void sieveOfEratorthenes1(int n){ //efficient
      boolean [] list= new boolean[n+1];
      Arrays.fill(list,true);

      for(int i=2;i*i<=n;i++){
          if(list[i])
          {
              for (int j = i * 2; j <= n; j = j + i) {
                  list[j] = false;
              }
          }
      }
      for(int i=2;i<=n;i++){
          if(list[i]){
              System.out.print(i+" ");
          }
      }
        System.out.println();
    }

    public static void sieveOfEratorthenes2(int n){ //optimised efficient
        boolean [] list= new boolean[n+1];
        Arrays.fill(list,true);

        for(int i=2;i*i<=n;i++){
            if(list[i])
            {
                for (int j = i * i; j <= n; j = j + i) {  //replaced i*2 with i*i
                    list[j] = false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(list[i]){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void sieveOfEratorthenes3(int n){ //optimised efficient
        boolean [] list= new boolean[n+1];
        Arrays.fill(list,true);

        for(int i=2;i*i<=n;i++){
            if(list[i])
            {
                for (int j = i * i; j <= n; j = j + i) {  //replaced i*2 with i*i
                    list[j] = false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(list[i]){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }



    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two positive integer to which prime number to found: ");
        int n= sc.nextInt();

        allPrime1(n);

        sieveOfEratorthenes1(n);

        sieveOfEratorthenes2(n);
    }
}
