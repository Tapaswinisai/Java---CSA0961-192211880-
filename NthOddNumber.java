public class NthOddNumber {
    public static void main(String[] args) {
        int N = 7;   
        System.out.print("First " + N + " odd numbers: ");
        for (int i = 1; i <= N; i++) {
            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber + " ");
        }
        System.out.println();
        int nthOddNumber = 2 * N - 1;
        System.out.println("The " + N + "th odd number is: " + nthOddNumber);
        int nthOddNumberAfterN = nthOddNumber + 2 * N;
        System.out.println("The " + N + "th odd number after the " + N + "th odd number is: " + nthOddNumberAfterN);
    }
}

