import java.util.Scanner;
import converter.Converter;

public static void main(String[]args){

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your km:");
    int km=sc.nextInt();


    System.out.println(Converter.kmtoMiles(km));
}

