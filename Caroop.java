import java.util.Scanner;

public class Caroop {
    String color;// every car's color // this is not static
    double km;// every car's km // this is not static
    int price;
    String brand;
    char currency;
    int release_year;

    void printInfo() {
        System.out.println(brand + "|" + km + "|" + price + "|" + currency + "|" + release_year + "|");
    }

    public static void main(String[] args) { // Main is method too
        Scanner sc = new Scanner(System.in);

        Caroop car1 = new Caroop(); // Commands only run in methods. They can be in any methods, not only main
                                    // But the program starts from main, so the first commands are always there.

        car1.color = "red";
        car1.km = 37_000;
        car1.price = 26_000;
        car1.currency = '$';
        car1.brand = "Audi A5";
        car1.release_year = 2018;

        Caroop car2 = new Caroop();
        car2.color = "blue";
        car2.km = 124_000;
        car2.price = 18_000;
        car2.currency = '$';
        car2.brand = "BMW 330 XDrive ";
        car2.release_year = 2015;

        System.out.println("Which car would you like to check? \n");
        String choice = sc.nextLine();

        if (choice.toLowerCase().equals("audi")) {// .equals it checks are these strings same or not if they are same it matches

            car1.printInfo();
        } else if (choice.toLowerCase().equals("bmw")) {// .toLowerCase() converts input to lowercase 

            car2.printInfo();
        }

        else {
            System.out.println("Invalid Choice ");

        }

    }
}
