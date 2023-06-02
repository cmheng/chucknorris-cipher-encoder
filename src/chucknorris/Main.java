package chucknorris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String input = scanner.nextLine();

        System.out.println();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            encrypted.append(input.charAt(i));
            if (i != input.length() - 1) encrypted.append(" ");
        }
        System.out.println(encrypted);
    }
}