import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int i = 0; j = str.length() - 1;

        String ans = "Yes";

        while(i <= j) {
            if(str.charAt(i) != str.charAt(j)) {
                ans = "No";
                break;
            }

            //afer every iteration.
            i++;
            j--;
        }

        System.out.println(ans);
    }
}