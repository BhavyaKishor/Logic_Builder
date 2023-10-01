import java.util.Scanner;

public class problem_15 {

    // Function to check if a number is even or odd
    public static void checkEvenOdd(int number) {
        String result = (number == 0 || number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is an " + result + " Number");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Provide the Number, Please: ");
        int number = input.nextInt();

        // Call the function to check if the number is even or odd
        checkEvenOdd(number);

        // Close the Scanner to avoid resource leaks
        input.close();
    }
}
