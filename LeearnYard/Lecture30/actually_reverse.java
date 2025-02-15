import java.util.Scanner;

class actually_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take input for size of the array
        int N = sc.nextInt();
        int arr[] = new int[N];

        //Input for N elements of the array
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //Write the code to reverse the array
        int i = 0;
        int j = N -1;

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for(int val : arr)
            System.out.print(val + " ");

            sc.close();

    }
}