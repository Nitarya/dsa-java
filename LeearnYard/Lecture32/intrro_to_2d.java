class intro-to-2d {
    public static void main(String[] args) {

        int arr[][] = new int[6][3];

        // Number of rows and columns
        System.out.println(arr.length + " rows.");
        System.out.println(arr[1].length + " cols.");

        int brr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9, 10} // Jagged array (not rectangular)
        };

        // Row-wise traversal
        for(int i = 0; i < brr.length; i++) {
            for(int j = 0; j < brr[i].length; j++)
                System.out.print(brr[i][j] + " ");
            System.out.println();
        }

        // Accessing specific elements
        System.out.println("brr[1][1] = " + brr[1][1]); // Output: 5

        // Creating a jagged array
        int jag[][] = new int[3][];
        jag[1] = new int[5];

        System.out.println(jag[0]); // null
        System.out.println(jag[1] + " " + jag[1].length); // Memory address + length
        System.out.println(jag[2]); // null

        // Printing the jagged array safely
        for(int i = 0; i < jag.length; i++) {
            if (jag[i] != null) {
                for(int j = 0; j < jag[i].length; j++)
                    System.out.print(jag[i][j] + " ");
                System.out.println();
            }
        }

        // Rectangular array
        int crr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Column-wise traversal
        for(int j = 0; j < crr[0].length; j++) {
            for(int i = 0; i < crr.length; i++)
                System.out.print(crr[i][j] + " ");
            System.out.println();
        }
    }
}
