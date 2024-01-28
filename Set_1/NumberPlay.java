package Set_1;

import java.util.Scanner;

public class NumberPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result;

        if (number > 50) {
            result = findDifferenceBetweenDigits(number);
        } else {
            result = findDifferenceBetweenReversedDigits(number);
        }

        System.out.println("Result: " + result);

        scanner.close();
    }

    // Function to find the difference between the digits of a number
    private static int findDifferenceBetweenDigits(int num) {
        int tensDigit = num / 10;
        int unitsDigit = num % 10;
        int diff= tensDigit - unitsDigit;

        return diff;
    }

    // Function to reverse a number and find the difference between its digits
    private static int findDifferenceBetweenReversedDigits(int num) {
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }

        return findDifferenceBetweenDigits(revNum);
    }
}
