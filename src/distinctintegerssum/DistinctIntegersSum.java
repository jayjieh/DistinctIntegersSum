package distinctintegerssum;

import java.util.Arrays;

/**
 *
 * @author Owori Juma
 */
public class DistinctIntegersSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = new int[]{5, 1, 3, 4, 7};
        int sum = 12;
        System.out.println(getTripletCount(arr, arr.length, sum));
    }

    static int getTripletCount(int arr[], int n, int sum) {

        Arrays.sort(arr);      // Sort input array   
        int ans = 0;           // Initialize result

        // Every iteration of loop counts triplet with
        // first element as arr[i].
        for (int i = 0; i < n - 2; i++) {
            // Initialize other two elements as corner elements
            // of subarray arr[j+1..k]
            int j = i + 1, k = n - 1;

            // Use Meet in the Middle concept
            while (j < k) { // If sum of current triplet is more or equal 
                if (arr[i] + arr[j] + arr[k] >= sum) {
                    k--;
                } else {
                    ans += (k - j);
                    j++;
                }
            }
        }
        return ans;
    }

}
