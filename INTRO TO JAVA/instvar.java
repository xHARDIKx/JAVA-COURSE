 class student {

    String name;
    int rollno;
    
}

public class instvar {
    public static void main(String args[]) {

        student obj = new student(); //creating student class object 

        obj.name = "hardik"  ;   //assigning values in the variables 
        obj.rollno=10 ;

        System.out.println(obj.name);      // printing name and roll no.
        System.out.print(obj.rollno);
    }
}
