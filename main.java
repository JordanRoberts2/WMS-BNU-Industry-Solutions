class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Supplier Ebay = new Supplier(); 
        Ebay.setName("Jordan");
        Ebay.getName();
        System.out.println(Ebay.getName());

        Ebay.setId(1);
        Ebay.getId();
        System.out.println(Ebay.getId());
    
        Order order = new Order("12345", "Toothbrush", "C123", 19.99);

//Product class output
        Product Toothbrush = new Product();
        Toothbrush.setName("Toothbrush");
        Toothbrush.setStockLevel(50); // Set stock level
        System.out.println("The name of this product is " + Toothbrush.getName());
        Toothbrush.printStockLevel(); // Print stock level
        order.printOrderDetails(); // Print order details
    }
}