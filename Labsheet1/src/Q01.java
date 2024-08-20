import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word;
        do {
            System.out.print("Enter a word with odd-length: ");
            word = scanner.nextLine();
            if (word.length() % 2 == 0) {
                System.out.println("Please enter a word with odd-length.");
            }
        }while ( word.length() % 2 == 0 );

        System.out.println("Middle character: " + word.charAt((word.length()-1) / 2));
        scanner.close();
    }
}
