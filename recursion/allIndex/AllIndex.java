package recursion.allIndex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllIndex {

    /**
     * n - the size of array
     * arr - the array of size n
     * key - the key whose first index is to be searched in array
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();
        List<Integer> ans = new ArrayList<>();
        allIndex(arr, 0, key, ans);
        System.out.println("The key is present at indices: " + ans);
    }

    private static void allIndex(int[] arr, int i, int key, List<Integer> ans) {
        if(i == arr.length)
            return;
        if(arr[i] == key)
            ans.add(i);

        allIndex(arr, i+1, key, ans);
    }
}
