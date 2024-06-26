package OOops;

class Main {
    public static void main(String[] args) {
        fibonacci obj1 = new fibonacci();
        reverse obj2 = new reverse();
        obj1.start();
        obj2.start();
    }

    static class fibonacci extends Thread {
        public void run() {
            int n1 = 0, n2 = 1, n3, i;
            System.out.println(n1);
            System.out.println(n2);
            for (i = 1; i < 6; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.println(n3);
            }
        }
    }

    static class reverse extends Thread {
        public void run() {
            int n = 123, rev = 0, rem;
            while (n != 0) {
                rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
                System.out.println("Reversed number is:" + rev);
            }
        }
    }
}