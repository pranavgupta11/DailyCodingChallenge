package hackerank;

import java.util.Arrays;

public class SockMerchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int ans = 0;
        for (int k = 0; k < n; k++) {
            outer:
            for (int i = 0; i < ar.length; i++) {
                //System.out.println(Arrays.toString(ar));
                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[i] == ar[j]) {
                        ar = removeTheElement(ar, j);
                        ar = removeTheElement(ar, i);
                        ans++;
                        break outer;
                    }
                }

            }
        }
        return ans;

    }

    // Function to remove the element
    public static int[] removeTheElement(int[] arr,
                                         int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }


    public static void main(String[] args) {
        int n = 9;
        int ar[] = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}


