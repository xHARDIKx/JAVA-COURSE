
public class average {
    public static void main(String[] args) {

        int marks[] = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for (int elements : marks) {

            sum = sum + elements;

        }
        System.out.println("sum of marks is " + sum);
        System.out.println(("no.of subjects is ") + (marks.length));
        System.out.println("average marks is sum/no. of subjects =" + sum / marks.length);

    }

}
