package chucknorris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String input = scanner.nextLine();

        System.out.println();
        System.out.println("The result:");
        for (char c : input.toCharArray()) {
            String binary = Integer.toBinaryString(c);
            int intBinary = Integer.parseInt(binary);
            System.out.printf("%s = %07d\n", c, intBinary);
        }
    }
}