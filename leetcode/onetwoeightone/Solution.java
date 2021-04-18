package leetcode.onetwoeightone;

public class Solution {

    static class Pair {
        int product;
        int sum;
    }

    public static Pair productSumPair(int n) {
        if (n == 0) {
            Pair p = new Pair();
            p.product = 1;
            p.sum = 0;
            return p;
        }
        Pair p = productSumPair(n / 10);
        p.sum += n % 10;
        p.product *= n % 10;
        return p;
    }

    public static int subtractProductAndSum(int n) {
        Pair p = productSumPair(n);
        return p.product - p.sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}
