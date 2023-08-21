class student {
   
 //class_Name.variable_Name;
    
   
 public static String name = "hardik"  ;         //static variable
    
    
//class_Name.variable_Name;
   
public static int rollno ;                                       

}

public class staticvar {

 public static void main (String args[]) {

    
    student.rollno = 76;                  // accessing static variable without creating object
    System.out.println (student.name+ "'s roll no. is " + student.rollno );


}

}
