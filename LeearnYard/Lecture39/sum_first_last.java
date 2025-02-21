import java.util.Scanner;

class sum_first_last {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String s = Integer.toString(N);

        System.out.println(s.charAt(0) + s.charAt(s.length()-1));
    }
}