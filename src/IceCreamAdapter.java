public class IceCreamAdapter implements IceCreamByType {
    private ModernIceCream modernIceCream;

    public IceCreamAdapter(ModernIceCream modernIceCream) {
        this.modernIceCream = modernIceCream;
    }

    @Override
    public void serveIceCream(String type) {
        if ("Classic".equals(type)) {
            modernIceCream.serveFlavoredIceCream("Vanilla");
        } else if ("Deluxe".equals(type)) {
            modernIceCream.serveFlavoredIceCream("Chocolate");
        } else {
            System.out.println("Unknown ice cream type.");
        }
    }
}
