package OOops;

public class cylinderarea {
    int r, h;
    double a;

    void get(int x, int y) {
        r = x;
        h = y;
    }

    void Cal() {
        a = 2 * 3.14 * (r + h);
        System.out.println("Area of Cylinder is: " + a);
    }

    public static void main(String args[]) {
        cylinderarea ob = new cylinderarea();
        ob.get(10, 20);
        ob.Cal();
    }
}