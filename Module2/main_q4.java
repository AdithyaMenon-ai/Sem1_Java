import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String productName;
    private double price;
    private int quantity;

    // Default constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        double total = price * quantity;

        // Print whole numbers without .0
        if (total == (long) total) {
            return productName + " x" + quantity + " = " + (long) total;
        }

        return productName + " x" + quantity + " = " + total;
    }
}

class Order {
    private String orderId;
    private List<Product> products;

    // Default constructor
    public Order() {
        products = new ArrayList<>();
    }

    // Parameterized constructor
    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Add product to order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Calculate total order amount
    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }

        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order ID: ").append(orderId).append("\n");
        sb.append("Products:\n");

        for (Product product : products) {
            sb.append(product).append("\n");
        }

        double total = calculateTotal();

        if (total == (long) total) {
            sb.append("Total: ").append((long) total);
        } else {
            sb.append("Total: ").append(total);
        }

        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read order ID
        String orderId = sc.nextLine().trim();

        // Read number of products
        int n = Integer.parseInt(sc.nextLine().trim());

        Order order = new Order(orderId);

        // Read product details
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();

            // Skip blank lines if present
            if (line.isEmpty()) {
                i--;
                continue;
            }

            String[] data = line.split(",");

            String productName = data[0].trim();
            double price = Double.parseDouble(data[1].trim());
            int quantity = Integer.parseInt(data[2].trim());

            Product product = new Product(productName, price, quantity);

            order.addProduct(product);
        }

        // Display order summary
        System.out.println(order);

        sc.close();
    }
}
