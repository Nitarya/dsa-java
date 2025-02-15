import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int N = sc.nextInt();
        int arr[] = new int[N];

        // Input for N elements of the array
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array
        int i = 0, j = N - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Print reversed array
        for (i = 0; i < N; i++) {  
            System.out.print(arr[i] + " "); 
        }

        sc.close(); 
    }
}