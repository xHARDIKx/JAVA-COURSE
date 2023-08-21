
class Employee {

    String name;
    int salary;

    public int getSalary() {
        return salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {

        name = n;

    }

}

class Cellphone {
    public void ring() {
        System.out.println("ringing________");
    }

    public void vibrate() {
        System.out.println("vibrating&%&%%&%*%&%*&%&%");
    }

    public void call() {
        System.out.println("calling kunnu ******");
    }

    public void playmusic() {
        System.out.println("playing songs,,,,,,,,,,");
    }
}

public class intro {
    public static void main(String[] args) {

        Employee hardik = new Employee();
        hardik.setName("hiiii");
        hardik.salary = 4000;
        System.out.println(hardik.getSalary());
        System.out.println(hardik.getName());

        // 2nd class cell phone

        Cellphone poco = new Cellphone();

        poco.ring();
        poco.call();
        poco.vibrate();
        poco.playmusic();

    }

}