import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in centimeters: ");
        double inches = (scanner.nextDouble()/2.54);
        System.out.println("Length: " + ((int) inches/12) + " feet " + String.format("%.2f", (inches%12)) + " inches");
    }
}
