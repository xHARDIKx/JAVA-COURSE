public class methodoverloading {

    static void name() { // method overloading is when you have same method name but different parameters
                         // here name() is the method name
                         // void is the return type of the method name
        System.out.println("1st method"); // this is the body of the method
    }

    static void name(int a, int b) { // here we have same method name but different parameters
        System.out.println("2nd method " + (a + b));
    }

    static void name(int a, int b, int c) { // here we have same method name but different parameters
        System.out.println("3rd merhod " + (a + b + c));

    }

    static void name(int a, int b, int c, int d) { // here we have same method name but different parameters
        System.out.println("4th method " + ((a + b) / (c + d)));
    }

    public static void main(String[] args) {

        int a = 4;

        int b = 4;
        int c = 4;
        int d = 4;
        name();
        name(a, b); // calling the method
        name(a, b, c);
        name(a, b, c, d);

    }

}
