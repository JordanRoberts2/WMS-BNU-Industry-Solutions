/*Order notesimport java.util.List;

 public class Order {
    private String orderId;
    private List<Item> items; // List automatically generated by Copilot, I don't know how to do this yet
    private String customerId;
    private double totalPrice;

    public Order(String orderId, List<Item> items, String customerId) {
        this.orderId = orderId;
        this.item = items;
        this.customerId = customerId;
        this.totalPrice = calculateTotalPrice();
    }

// I don't know how to do this yet (14-20) - Copilot generated this
    private double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Getters and Setters

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
        this.totalPrice = calculateTotalPrice(); // Recalculate total price when items are updated
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    // Method to process the order
}


//order_id
// items
// customer_id
//total_price


//process_order

*/