public class meth2 {

    static int logic(int a, int b) {
        int c;
        if (a > b) {
            System.out.println("eys");
        } else {
            System.out.println("nooooo");
        }
        return 0;
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 1;
        int z = 11;
        logic(x, y);
        logic(y, z);

    }
}