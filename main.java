import java.util.Scanner;

class Main {
    private static InventoryManager inventoryManager = new InventoryManager();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Warehouse Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Restock Product");
            System.out.println("3. View Inventory");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
 
            switch (choice) {
                case 1 -> addProduct(scanner);
                //case 2 -> restockProduct(scanner);
                case 3 -> inventoryManager.printInventory(scanner);
            }
        } while (choice != 0);
    }
    private static void addProduct(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter product price: ");
        int price = scanner.nextInt();
        System.out.print("Enter stock level: ");
        int stockLevel = scanner.nextInt();
        
        Product product = new Product(name, id, price, stockLevel);
        System.out.println("Product added: " + product.getName());

        }
    }