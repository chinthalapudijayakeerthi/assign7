import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        inputString = inputString.toLowerCase();
        int vowelCount = 0;
        boolean vowelPresent = false;
        for (int i = 0; i < inputString.length(); i++) 
        {
            char ch = inputString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowelCount++;
                vowelPresent = true;
            }
        }
        if (vowelPresent) 
        {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } 
        else 
        {
            System.out.println("No vowels are present in the string.");
        }
        scanner.close();
    }
}
