// Question - Given an array and M queries, each query will have an index i, we need to find max of all array elements except a[i].

import java.util.*;

class MaxQueries {

    public static void answerQueries(int[] arr, int[] queries) {
        int N = arr.length;
        int M = queries.length;

        int pre[] = new int[N];
        int suf[] = new int[N];

        // Let's fill up the pre array
        for (int i = 0; i < N; i++)
            pre[i] = (i == 0) ? arr[i] : Math.max(pre[i - 1], arr[i]);

        // Let's fill up the suf array
        for (int i = N - 1; i >= 0; i--)
            suf[i] = (i == N - 1) ? arr[i] : Math.max(suf[i + 1], arr[i]);

        for (int id : queries) {
            int ans;

            if (id == 0)
                ans = suf[1]; // [1,2,... N-1]
            else if (id == N - 1)
                ans = pre[N - 2]; // [0, 1, 2, ... N - 2]
            else
                ans = Math.max(pre[id - 1], suf[id + 1]);

            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];
        int queries[] = new int[M];

        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < M; i++)  // Fixing this loop to M instead of N
            queries[i] = sc.nextInt();

        answerQueries(arr, queries);
    }
}











// Time Complexity Analysis
// The code consists of three main steps:

// Building the pre array (prefix maximums)

// This loop runs from 0 to N-1, so its time complexity is O(N).
// Building the suf array (suffix maximums)

// This loop also runs from N-1 to 0, so its time complexity is O(N).
// Processing M queries

// For each query, the answer is computed in O(1) time using pre and suf arrays.
// Since there are M queries, this step takes O(M).
// Overall Time Complexity
// Since we process three independent loops (O(N), O(N), and O(M)), the total time complexity is:

// 𝑂(N)+𝑂(𝑁)+𝑂(𝑀)=𝑂(𝑁+𝑀)
// O(N)+O(N)+O(M)=O(N+M)
// Thus, the worst-case time complexity is O(N + M).

// Space Complexity Analysis
// The space complexity comes from storing:

// Input array arr[] → O(N)
// Queries array queries[] → O(M)
// Prefix max array pre[] → O(N)
// Suffix max array suf[] → O(N)
// Total space used:


// O(N)+O(M)+O(N)+O(N)=O(3N+M)
// Since constants are ignored in asymptotic notation, the space complexity is O(N + M).