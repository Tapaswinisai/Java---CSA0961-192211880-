package OOops;

class Main {
    public static void main(String[] args) {
        string obj1 = new string();
        number obj2 = new number();
        obj1.start();
        obj2.start();
    }

    static class string extends Thread {
        public void run() {
            int i;
            String rev = " ";
            char ch;
            String a = "TEMPLE";
            int n = a.length();
            for (i = n - 1; i >= 0; i--) {
                ch = a.charAt(i);
                rev = rev + ch;
            }
            System.out.println("Reversed String is: " + rev);
        }
    }

    static class number extends Thread {
        public void run() {
            int n = 123, rev = 0, rem;
            while (n != 0) {
                rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            System.out.println("Reversed number is:" + rev);
        }
    }
}