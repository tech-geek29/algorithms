package recursion.firstindex;

import java.util.Scanner;

public class FirstIndex {

    /**
     * n - the size of array
     * arr - the array of size n
     * key - the key whose first index is to be searched in array
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();

        System.out.println("The key is present at index: "+firstIndex(arr, 0, key));
    }

    private static int firstIndex(int[] arr, int i, int key) {
        if(i == arr.length)
            return -1;
        if(arr[i] == key)
            return i;

        return firstIndex(arr, i+1, key);
    }
}
