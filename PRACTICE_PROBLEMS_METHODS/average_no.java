// Q // Write a function To find the average of a set of number passed as arguments
// average of set of no. 
public class average_no {

    static int arg(int... arr) {

        int result = 0;
        for (int i = 0; i < arr.length; i++) {

            result = (result + arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("sum of the  given no. is " + arg(2, 2, 2, 4, 4));
        System.out.print("average of the given no. is = " + (arg(2, 2, 2, 4, 4) / 2));
    }
}