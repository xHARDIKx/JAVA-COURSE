
public class max {

    public static void main(String[] args) {

        int arr[] = { 32, 34, 54, 56, 67, 78, -89, -133 };

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println("when i is " + i + " max is " + max);
            } else {
                continue;
            }
        }
        System.out.println(("maximum element in the give array is ") + max);

    }
}
