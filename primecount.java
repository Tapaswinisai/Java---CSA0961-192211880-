import java.util.Scanner;

public class primecount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = scanner.nextInt();
        
        printOddNumbers(n);
    }

    public static void printOddNumbers(int n) {
        System.out.println("Odd numbers less than " + n + " are:");
        for (int i = 1; i < n; i += 2) {
            System.out.println(i);
        }
    }
}
