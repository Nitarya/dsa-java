// You are given two integer arrays num1 and num2, sorted in non-decreasing order,
// and two intagers m and n,and representing the number of elements in nums1 and 
// us nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.


// The final sorted array should not be returned by the function, but instead be 
// stored inside the array nums1. To accommodate this, nums1 has a length of m + n, 
// where the first m elements denote the elements that should be merged, and 
// the last n elements are set to 0 and should be ignored, nums has a length of n.


import java.util.*;

class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> aux = new ArrayList<>();
        int i = 0, j = 0; // Declare i and j before using them

        // Merge until one array is exhausted
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                aux.add(nums1[i]);
                i++;
            } else {
                aux.add(nums2[j]);
                j++;
            }
        }

        // Add remaining elements from nums1
        while (i < m) {
            aux.add(nums1[i]);
            i++;
        }

        // Add remaining elements from nums2
        while (j < n) {
            aux.add(nums2[j]);
            j++;
        }

        // Copy the merged elements back to nums1
        for (int id = 0; id < n + m; id++)
            nums1[id] = aux.get(id);
    }

    public static void main(String[] args) {
        MergeSorted obj = new MergeSorted();
        int[] nums1 = {1, 3, 5, 0, 0, 0}; // nums1 has extra space for nums2
        int m = 3;
        int[] nums2 = {2, 4, 6};
        int n = 3;

        obj.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}



// Time Complexity Analysis
// The function follows these steps:

// Merging the two arrays (while loops)

// The while (i < m && j < n) loop runs at most m + n times.
// The two while loops (for the remaining elements in nums1 and nums2) run at most m and n times combined.
// Since each element from both arrays is processed once, the merging step takes O(m + n) time.
// Copying elements from aux back to nums1

// The for loop runs O(m + n) times to copy elements back into nums1.
// Thus, the overall time complexity is O(m + n).

// Space Complexity Analysis
// Auxiliary Array aux

// A new ArrayList<Integer> of size O(m + n) is created to store merged elements.
// Other variables (i, j, id, etc.)

// These use O(1) space, which is negligible.
// Since the extra space used is proportional to the input size (m + n), the space complexity is O(m + n).
