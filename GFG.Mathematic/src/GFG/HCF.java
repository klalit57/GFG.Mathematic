package GFG;
import java.util.Scanner;
import java.lang.Math;

public class HCF {
    static int hcf(int n1, int n2){
        int res=Math.min(n1,n2);
        while(res>0){
            if(n1%res==0 && n2%res==0){
                break;
            }
            res--;
        }
        return res;
    }

    static int euclid(int a, int b){
        while(a!=b){
            if(a>b){
                a-=b;
            }
            else{
                b-=a;
            }
        }
        return a;
    }

    static int euclidOptimised(int a, int b){
            if (b == 0) {
                return a;
            }else{
               return euclidOptimised(b,a%b);
            }

    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two positive integer: ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();

        System.out.println(hcf(n1, n2));

        System.out.println(euclid(n1, n2));

        System.out.println(euclidOptimised(n1, n2));

    }
}
