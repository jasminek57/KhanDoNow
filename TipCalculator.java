import java.util.Scanner;
public class TipCalculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to Giggle Resturaunt!");
        System.out.print("How many people are eating today? ");
        int people = scan.nextInt();
        System.out.print("Enter your tip percentage as an integer: ");
        int percent = scan.nextInt();
        System.out.print("Your tip percentage will be %" + percent);
        double totalPrice = 0;

        while (itemv != -1) {
            System.out.print("Enter the cost of the item(s) you order (enter -1 to stop): ");
            double price = scan.nextDouble();
            totalPrice += price;
        }

        double perPerson = totalPrice / people;
        System.out.print("Price before tip: $" + totalPrice);
        System.out.print("Price per person before tip: $" + perPerson);

        double tip = (percent * totalPrice) / 100;
        System.out.print("Tip amount being added to bill: $" + tip);
        double singularTip = tip / people;

    }
}


