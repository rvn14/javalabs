import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name as First Middle Last format: ");
        String[] fName = scanner.nextLine().split(" ");

        System.out.println("-------------------------");
        System.out.println(fName[2] + ", " + fName[0] + " " + fName[1].charAt(0) + ".");
        scanner.close();

    }
}
