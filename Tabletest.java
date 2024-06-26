package OOops;

class Tabletest {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
    }

    static class A extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("9 X" + i + "=" + (9 * i));
            }
        }
    }

    static class B extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("9 X" + i + "=" + (9 * i));
            }
        }
    }
}