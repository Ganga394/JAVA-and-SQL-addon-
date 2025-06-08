import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");

        int wordCount = words.length;

        int charCount = input.replace(" ", "").length();

        String reversed = new StringBuilder(input).reverse().toString();

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("\n--- String Analysis ---");
        System.out.println("Original Sentence: " + input);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Character Count (excluding spaces): " + charCount);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Longest Word: " + longestWord);
    }
}
