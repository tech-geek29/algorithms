package recursion.countzeros;

import java.util.Random;
import java.util.Scanner;

public class CountZeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Total number of zeros: " + zeros(n));
    }

    private static int zeros(int n) {
        if(n < 10){
            if(n == 0)
                return 1;
            return 0;
        }

        return n%10 == 0 ? 1 + zeros(n/10) : zeros(n/10);
    }
}
