package objectArray;

public class Product implements Comparable<Product> {
    private double weight;
    private double price;
    private int id;

    // Constructor
    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    // Getter methods
    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    // Implementation of Comparable interface
    @Override
    public int compareTo(Product otherProduct) {
        // Compare products based on their price
        return Double.compare(this.price, otherProduct.getPrice());
    }

    // toString method to print product details
    @Override
    public String toString() {
        return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating some products for testing
        Product product1 = new Product(2.5, 20.0, 101);
        Product product2 = new Product(1.8, 15.0, 102);
        Product product3 = new Product(3.0, 25.0, 103);

        // Comparing products based on price
        System.out.println("Comparison result:");
        int result = product1.compareTo(product2);
        if (result < 0) {
            System.out.println(product1 + " is cheaper than " + product2);
        } else if (result > 0) {
            System.out.println(product1 + " is more expensive than " + product2);
        } else {
            System.out.println(product1 + " and " + product2 + " have the same price");
        }
    }
}

