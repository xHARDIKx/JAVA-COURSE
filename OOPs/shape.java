class square {

    int side;

    public int area() {
        return (side * side);
    }

    public int perimeter() {
        return (4 * side);
    }
}

public class shape {
    public static void main(String[] args) {

        square one = new square();
        one.side = 10;
        System.out.println(one.area());
        System.out.println(one.perimeter());

    }

}
