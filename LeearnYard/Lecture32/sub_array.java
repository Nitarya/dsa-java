import java.util.Scanner;

class sub_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        int N = sc.nextInt();
        int arr[] = new int[N];

        // Filling the array with input values
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Print all the subarrays
        for (int st = 0; st < N; st++) {
            // en = st, st + 1, st + 2.. N -1
            for (int en = st; en < N; en++) {  // Fixed loop header
                for (int i = st; i <= en; i++) {  // Added missing loop to print subarrays
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close(); // Close Scanner to prevent resource leak
    }
}
