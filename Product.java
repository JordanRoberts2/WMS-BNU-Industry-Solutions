public class Product{
    private String name;
    private int id;
    private int price;
    private int stockLevel;
    

    //contructor method

    public Product(String name, int id, int price, int stockLevel) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.stockLevel = stockLevel;
    }
   
    public void addStock(int amount) {
        if(amount > 0) {
            stockLevel += amount;            
        System.out.println("Stock level updated. New stock level: " + stockLevel);

        } else {
            System.out.println("Invalid amount. Cannot add stock.");
            return;
        }
        
    }

    public void removeStock(int amount){
        if (stockLevel >= amount) {
            stockLevel -= amount;
            System.out.println("Stock level updated. New stock level: " + stockLevel);
        } else {
            System.out.println("Not enough stock to remove. Current stock level: " + stockLevel);
        }
    }

//getters and setters
public String getName(){
    return name;
}     
public void setName(String name){
    this.name = name;
}

public int getId(){
    return id;
}
public void setId(int id){
    this.id = id;
}
public int getPrice(){
    return price;
}

// stockLevel method 
public int getStockLevel(){
    return stockLevel;
}

public void setStockLevel(int stockLevel){
    this.stockLevel = stockLevel;
}
// statement to add stock to existing stock for an item
public void printDetails() {
    System.out.println("Id: " + id + ", Name: " + name + ", Quantity: " + stockLevel + ", Price: " + price);
}
// if statement for alerting low stock
}