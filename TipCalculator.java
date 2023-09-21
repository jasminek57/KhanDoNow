import java.util.Scanner;
public class TipCalculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to Giggle Resturaunt!");
        System.out.print("How many people are eating today? ");
        int people = scan.nextInt();
        System.out.print("Enter your tip percentage as an integer: ");
        int percent = scan.nextInt();
        double totalPrice = 0;

        while (itemv != -1) {
            System.out.print("Enter the cost of the item you order (enter -1 to stop): ");
            double price = scan.nextDouble();
            totalPrice += price;
        }

        double tip = (percent * totalPrice) / 100;
        double singularTip = tip / people;

    }
}


