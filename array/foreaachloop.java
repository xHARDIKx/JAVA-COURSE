
public class foreaachloop {

    public static void main(String[] args) {

        String items[] = { "hardik", "vishal", "vishesh", "vishal", "vishal" };
        int rollnumber[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (String elements : items) {
            System.out.println(elements);
        }

        for (int elements1 : rollnumber) {
            System.out.println(elements1);
        }
    }
}
