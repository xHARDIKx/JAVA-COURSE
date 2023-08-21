public class cel_to_fhar {

    static int temp(int c) {

        return ((c * 9 / 5) + 32);

    }

    public static void main(String[] args) {

        System.out.println(temp(10));
    }
}