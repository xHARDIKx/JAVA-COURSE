
/*   


     ///*                  
     //**
     /***
     ****
     /***
     //**
     ///*
 */
public class diamond {
    public static void main(String[] args) {
        int n = 2;

        for (int space = 1; space <= n; space++) {
            for (int i = 1; i <= space; i++) {
                System.out.print("/");
            }
            for (int j = 1; j <= n - space + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
