import java.util.Scanner;

public class myfirstapp{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        System.out.println("What's your name");

        String name= sc.nextLine(); // in Java you must to add every variables' type 
                                    // sc reader read user's  next line 

        System.out.println("Hello "+ name);




    }
}