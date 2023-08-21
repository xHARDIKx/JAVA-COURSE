
public class array2for {

    public static void main(String[] args) {

        String[] names = { "haridk", "vishal", "vishesh", "shal", "vishal", " shubham " };
        // dispaying array for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
        
        for (int i = names.length - 1; i > 0; i--) {
            System.out.println(names[i]);
        }
    }
}
