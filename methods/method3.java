public class method3 {

    static int logic(int x, int y) {
        int z;
        z = ((x + y) / 2);
        System.out.println("sum of x and y is " + (x + y));

        return z;

    }

    public static void main(String[] args) {
        int a = 20000;
        int b = 60000;
        int c;

        c = logic(a, b);
        System.out.println(c);

        int a2 = 700;
        int b2 = 600;
        int c2;
        c2 = logic(a2, b2);
        System.out.println(c2);

    }
}