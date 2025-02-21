import java.util.Scanner;

class string_basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = "I like rain!";
        String str2 = new String("But I got cold easily");

        System.out.println(str1);
        System.out.println(str2);

        // Take input
        System.out.print("Enter a single word: ");
        String str = sc.next();  // Declare str
        System.out.println(str);

        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter a full sentence: ");
        str2 = sc.nextLine();
        System.out.println(str2);

        String greet = "Hello!";
        String name = "My name is Khan.";
        String intro = greet + " " + name;

        System.out.println(intro);

        sc.close();  // Close Scanner to avoid resource leak
    }
}
