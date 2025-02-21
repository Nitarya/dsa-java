import java,util.Scanner;
class most_recurring {
    public static void main(String[] args) {
        //ypur code goes here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        //Create an array of size 256.
        //to store frequenccies of diff.
        //characters in the given string

        int freq[] = new int[256];

        for(int i = 0; i < s.length(); i++) {
            int id = s.charAt(i);
            freq[id]++; //increment freq[id] by 1.
        }

        //You have all the frequencies now
        //Print the character with max frequency
        int max_id = -1;
        int max_f = -1

        for(int i = 0; i < 256; i++) {
            if(freq[i] > max_f) {
                max_f = freq[i];
                max_id = i;
            }
        }
        System.out.println((char)max_id);
    }
}