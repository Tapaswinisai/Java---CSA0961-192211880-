import java.util.Scanner;

class fibb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int sumEven = 0;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            if (i % 2 == 0) {
                sumEven += a;
            }
            a = b;
            b = c;
        }

        System.out.println("Sum " + n + " is: " + sumEven);
    }
}