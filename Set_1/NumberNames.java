package Set_1;
import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numberNames = {
            "zero", "one", "two", "three", "four", 
            "five", "six", "seven", "eight", "nine"
        };

        String input="";
        
        while (!input.equals("q")) {
            System.out.print("\nEnter a number or 'q' to quit: ");
            input = scan.nextLine();

            if (!input.equals("q")) {
                try {
                    for(int i=0; i<input.length();i++) {
                    	char ch = input.charAt(i);
                    	int number = Integer.parseInt(String.valueOf(ch));
                        if (number >= 0 && number <= 9) {
                            System.out.print(numberNames[number] + " ");
                        } else {
                            System.out.println("Invalid input. Please enter a number between 0 and 9.");
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'q' to quit.");
                }
            }
        } 

        System.out.println("Exiting the program. Goodbye!");
        scan.close();
    }
}
