
public class array1 {

    public static void main(String[] args) {

        // String[] students = new String[5]; // declaration and memory allocation

        /*
         * String[] marks; // declarqtion of array
         * marks = new String[5]; // memory allocation
         */
        /*
         * String[] student = { "hardik", "vishal", "vishesh", "vishal", "vishal" }; //
         * declaration and initialization
         * 
         * System.out.println(student[0]);
         * System.out.println(student[1]);
         * 
         * System.out.println(student.length);
         */
        String[] students = new String[5];

        students[0] = "hardik";
        students[1] = "vishal";
        students[2] = "vishesh";
        students[3] = "vishal";
        students[4] = "vishal";
        System.out.println(
                students[0] + " " + students[1] + " " + students[2] + " " + students[3] + " " + students[4]);

    }
}
