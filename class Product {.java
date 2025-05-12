class Product {
    String pcode;
    String pname;
    double price;

    // Constructor without 'this'
    Product(String c, String n, double p) {
        pcode = c;
        pname = n;
        price = p;
    }

    void display() {
        System.out.println("Code: " + pcode);
        System.out.println("Name: " + pname);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 55000);
        Product p2 = new Product("P002", "Smartphone", 30000);
        Product p3 = new Product("P003", "Tablet", 20000);

        System.out.println("Product with the lowest price:");

        if (p1.price < p2.price && p1.price < p3.price) {
            p1.display();
        } else if (p2.price < p3.price) {
            p2.display();
        } else {
            p3.display();
        }
    }
}
