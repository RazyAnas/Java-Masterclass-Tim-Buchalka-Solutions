package AbstractClassChallenge;

// manage a "list of products for sale", including displaying the product details
// manage an order, which can just be a "list of OrderItem" objects
// have methods to "add an item to the order", and "print the ordered items", so it looks like a sales receipt

import java.util.ArrayList;

public class Store {

    static ArrayList<ProductForSale> products = new ArrayList<>(); // "list of products for sale"
    static ArrayList<OrderItem> orderList = new ArrayList<>(); // making order list

    public static void main(String[] args) {

        // defining our store stock
        products.add(new Toy("Rubik's Cube", 450.3, "ETERNAL Cube 3x3 High Speed Stickerless Magic Cubes Puzzle Game Toy"));
        products.add(new Toy("Xylophone", 281, "Learn With Fun 2 in 1 Xylophone and Piano Toy  (Multicolor)"));
        products.add(new HomeDecor("Artificial Plant", 250, "Naturally Bonsai for home decoration,office decor, cafe, (4) Bonsai Wild Artificial Plant with Pot  (20 cm, Multicolor)"));
        products.add(new Electronics("Trimmer", 899, "Mi by Xiaomi Beard 2C Trimmer 90 min Runtime 40 Length Settings  (Black)"));
        products.add(new Electronics("Apple iPhone", 84_900.9, "Apple iPhone 16 (Teal, 256 GB)"));

        System.out.println("\nStore Stock:");
        displayStoreProducts();

        System.out.println();

        // adding item to cart
        addItemToOrder(2, 0); // 2 - rubik's cube
        addItemToOrder(1, 4); // 1 - iPhone
        addItemToOrder(3, 3); // 3 - trimmer

        // print the full bill
        double totalPrice = 0;
        System.out.println("Your Order:");
        for (OrderItem item : orderList) {
            System.out.println(item);
            totalPrice += item.getPrice();
        }

        // checkout and total
        System.out.printf("_".repeat(40) + "\nTOTAL PRICE = ₹%s\n", totalPrice);
    }

    public static void addItemToOrder(int quantity, int productIndex) { // "add an item to the order"

        // order items from stock
        orderList.add(new OrderItem(quantity, products.get(productIndex)));
    }

    public static void displayStoreProducts() {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

}
