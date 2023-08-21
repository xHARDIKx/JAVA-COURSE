public class Addition {
    
    public void add(){  // function calling 

         int a=10;
         int b=20;        //local variables
         int c=a+b;

         System.out.println(c);   //print sum

    }
    public static void main(String args[]) {  //driver code

        Addition obj = new Addition(); //create object of addition class

        obj.add(); // function call
    }

}

