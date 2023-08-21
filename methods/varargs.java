
public class varargs {

    public static int logic(int x, int... arr) {
        int result = x;
        for (int i = 0; i < arr.length; i++) {//
            result = arr[i] + result;// result = result + element;

        }
        return result;
    }

    static float divide(float a, float... arr) {// 8,4 //here array value is 4 and integer value is 8
        float answer = a; // 8
        for (float i : arr) { // 4
            answer = answer / i; // 8/4 = 2.0

        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println("the sum of given is" + logic(5));
        System.out.println("the sum of given  is" + logic(4, 5));

        System.out.println("the sum of given element is" + logic(45));
        System.out.println("the sum of given element is" + logic(5, 55));
        System.out.println("the sum of given element is" + logic(5, 50));

        System.out.println("1st division result is " + divide(8, 4));

        System.out.println("2nd division result is " + divide(3, 9));

    }

}
