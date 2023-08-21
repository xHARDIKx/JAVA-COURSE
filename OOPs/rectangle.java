
class rectan {
    int lenght;
    int width;

    public int area() {
        return (lenght * width);

    }

    public int perimeter() {
        return (4 * (lenght * width));
    }

}

class triangle {

    int height;
    int base;
    int side1;
    int side2;

    public int area() {
        return ((base * height) / 2);
    }

    public int perimeter() {
        return (side1 + side2 + base);
    }
}

public class rectangle&triangle
{

    public static void main(String[] args) {

        rectan one = new rectan();

        one.lenght = 4;
        one.width = 2;
        System.out.println("\nRECTANGLE");
        System.out.println((one.area()));
        System.out.println((one.perimeter()));

        triangle two = new triangle();

        two.base = 2;
        two.side1 = 3;
        two.height = 4;
        two.side2 = 5;
        System.out.println("\nTRIANGLE");
        System.out.println(two.area());
        System.out.println(two.perimeter());
    }

}
