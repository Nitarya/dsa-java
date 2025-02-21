/*
Consider a permutation of numbers 1 to N written on a paper. Let's denote the product of its elements 
as P and the sum of its elements as S. Given a positive integer N, your task is to determine whether
P is divisible by S or not.  
 */ 

import java.util.Scanner;

public class PermutationDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SSystem.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        scanner.close();

        long product = 1;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            product *= i;
            sum += i;
        }

        if (product % sum == 0) {
            System.out.println("Yes, P is divisible by S.");
        } else {
            System.out.println("No, P is not divisible by S.");
        }
    }
}