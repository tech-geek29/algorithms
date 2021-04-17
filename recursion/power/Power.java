package recursion.power;

import java.util.*;

public class Power{

    private static long power(long x, long n){
        if(n == 0)
            return 1;

        if(n == 1){
            return x;
        }

        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x in x^n: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of n in x^n: ");
        int n = sc.nextInt();
        System.out.println("x^n = "+power(x, n));
    }
}