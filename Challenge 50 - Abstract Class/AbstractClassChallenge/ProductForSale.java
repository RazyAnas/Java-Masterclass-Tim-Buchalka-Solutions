package AbstractClassChallenge;

// abstract class -> productForSale
public abstract class ProductForSale {

    // three fields type, price and a description
    String type;
    double price;
    String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    // Class should also have methods to: getSalesPrice (concrete) --> takes quantity and returns the quantity*price
    public double getSalesPrice(int quantity) {

        return quantity * price;
    }

    // method to: printPricedItem (concrete) --> takes quantity and print itemized line item order with quantity and line-item price
    // like this: 3 x Pen @ ₹10 = ₹30
    public String printPricedItem(int quantity) {
        return quantity + " x " + type + " @ " + "₹" + price + " = " + "₹" + getSalesPrice(quantity);
    }

    // method to: showDetails (abstract) --> represents what might be displayed on product page: Product type, description, price, so on
    public abstract void showDetails();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

// also create an OrderItem type that has two fields: quantity, ProductForSale
class OrderItem {
    private final int quantity;
    ProductForSale productForSale; // OrderItem "HAS-A" productForSale

    public OrderItem(int quantity, ProductForSale productForSale) {
        this.quantity = quantity;
        this.productForSale = productForSale;
    }

    public double getPrice() {
        return productForSale.getSalesPrice(quantity);
    }

    @Override
    public String toString() {
        return productForSale.printPricedItem(quantity);
    }
}

// also create two or three classes that extends ProductForSale, that will be your products in your store
class Toy extends ProductForSale {

    public Toy(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

        System.out.println("Type: " + type);
        System.out.println("Price: ₹" + price);
        System.out.println("Description: " + description);
        System.out.println();
    }

}

class HomeDecor extends ProductForSale {

    public HomeDecor(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

        System.out.println("Type: " + type);
        System.out.println("Price: ₹" + price);
        System.out.println("Description: " + description);
        System.out.println();
    }

}

class Electronics extends ProductForSale {

    public Electronics(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

        System.out.println("Type: " + type);
        System.out.println("Price: ₹" + price);
        System.out.println("Description: " + description);
        System.out.println();
    }

}

