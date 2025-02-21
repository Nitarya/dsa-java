import java.util.Arrays;

class string_methods {

    //Your code goes here
    String str = " Hello, I'm coming, Bye!   ";
    System.out.println(str.length());
    System.out.println(str.charAt(3)); 

    //subString
    System.out.println(str.substring(7, 17));
    System.out.println(str.substring(7));

    //split
    String arr[] = str.split(",");
    System.out.println(Arrays.toString(arr));

    //contains
    System.out.println(str.contains("coming!"));
    System.out.println(str.contains("coming"));

    //trim
    String str2 = str.trim();
    System.out.println(str);
    System.out.println(str2);

}

