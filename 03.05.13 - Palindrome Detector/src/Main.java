import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.print("Please enter the word/phrase/sentence you want to test: ");
        userInput = scanner.nextLine();

        System.out.println("That is" + (PalindromeDetector.detect(userInput) ? " " : " not ") + "a palindrome.") ;
    }
}
