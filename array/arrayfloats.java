
public class arrayfloats {

    public static void main(String[] args) {

        float floats[] = { 40.6f, 23.5f, 34.4f, 45.3f, 56.2f };
        float sum = 0;

        // METHOD 1

        // for (float i = 0; i < floats.length; i++) {
        // sum = sum + floats[(int) i]; comment selection cntl + k and c
        // }
        // System.out.println(sum);

        // OR

        // method 2

        for (float elements : floats) {
            sum = sum + elements;
        }
        System.out.println(sum);

    }
}
