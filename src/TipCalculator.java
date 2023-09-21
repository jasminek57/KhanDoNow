import java.lang.Math;
import java.util.Scanner;
public class TipCalculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Giggle Resturaunt!");
        System.out.print("How many people are eating today? ");
        int people = scan.nextInt();
        System.out.print("Enter your tip percentage as an integer (0-100): ");
        int percent = scan.nextInt();
        System.out.println("Your tip percentage will be " + percent + "%");
        double totalPrice = 0;
        double price = 0;

        while (price != -1) {
            System.out.print("Enter the cost of the item(s) you order in dollars and cents (-1 to stop): ");
            price = scan.nextDouble();
            if (price != -1) {
                totalPrice += price;
            }
        }

        System.out.println("------------------------------------------------------------------");

        double perPerson = totalPrice / people;
        double tip = (percent * totalPrice) / 100;
        double singularTip = tip / people;
        perPerson = Math.round((perPerson) * 100.0) / 100.0;
        singularTip = Math.round((singularTip) * 100.0) / 100.0;
        tip = Math.round((tip) * 100.0) / 100.0;

        System.out.println("Price before tip: $" + totalPrice);
        System.out.println("Price per person before tip: $" + perPerson);

        System.out.println("Tip amount being added to bill: $" + tip);
        System.out.println("Total bill including tip: $" + (tip + totalPrice));

        System.out.println("Per person tip amount: $" + singularTip);

        System.out.println("Price per person: $" + (singularTip + perPerson));

    }
}


