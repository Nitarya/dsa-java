import java.util.Arrays;

class arrayIntro {
    public static void main(String args[]) {
        // int arr[];
        // arr = new int[5];

        // arr[0] = 10;
        // arr[1] = 5;
        // arr[2] = 12;
        // arr[3] = 40;

        // // for(int i = 0; i < arr.length; i++)
        // //     System.out.println(arr[i]);

        // for(int i = 0; i < arr.length; i++)
        //     System.out.print(arr[i] + " ");

        //     int arr2[] = {5, 1, -5, 7, 10, 20};

        //     System.out.println("");

        //     for(int i = 0; i < arr2.length; i++)
        //         System.out.print(arr2[i] + " ");

        // // System.out.println(arr.length);


        //     System.out.println("");
        //     for(int value : arr2) {
        //         System.out.print(value + " ");
        //     }

        //     System.out.println("");
        //     //Another syntax for above line is System.out.print("\n");

        //     //toString()
        //     System.out.println(Arrays.toString(arr2));

        //     //sort()
        //     Arrays.sort(arr2);
        //     System.out.println(Arrays.toString(arr2));


        //     //fill()
        //     //for(int i = 0; i < arr.length; ++i)
        //        // arr[i] = 10; Don't want to do this.

        //     Arrays.fill(arr2, 1);
        //     System.out.println(Arrays.toString(arr2));

                int arr1[] = {1, 2, 3};
                int arr2[] = arr1;
                System.out.println(arr1);
                System.out.println(arr2);


                //Print arr2
                System.out.println(Arrays.toString(arr2));
                arr1[1] = 5;
                System.out.println(Arrays.toString(arr2));

                //Print arr1
                  System.out.println(Arrays.toString(arr1));
                arr1[2] = 15;
                System.out.println(Arrays.toString(arr1));

    }
}