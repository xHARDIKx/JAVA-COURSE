class team {

    public static int playerno1  ;
    public static String name1 ;
    public static int playerno2  ;
    public static String name2 ;
}

public class  staticvar1 {

    public static void main(String args[]) {



        team.playerno1 = 1;
        team.playerno2 =2;
        team.name1= "hardik";
        team.name2="jain";

        System.out.println( " the tshirt no. of the team " + team.name1 + " is " + team.playerno1 ) ;
        System.out.println( " the tshirt  no. of the team " + team.name2 + " is " + team.playerno2 );
    }
}