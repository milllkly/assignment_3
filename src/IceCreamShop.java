import java.util.Scanner;

public class IceCreamShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ModernIceCream modernIceCream = new ModernIceCream();
        IceCreamByType iceCream = new IceCreamAdapter(modernIceCream);

        while (true) {
            System.out.println("Welcome to the Ice Cream Shop!");
            System.out.println("Available Types: Classic, Deluxe");
            System.out.print("Enter ice cream type (or 'exit' to quit): ");

            String type = scanner.nextLine();

            if ("exit".equalsIgnoreCase(type)) {
                System.out.println("Thank you for visiting!");
                scanner.close();
                return;
            }

            iceCream.serveIceCream(type);
            System.out.println("----------------------------");
        }
    }
}
