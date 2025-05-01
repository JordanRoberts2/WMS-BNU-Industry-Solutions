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
        this.stockLevel = stockLevel;}
       
//getters and setters
public String getName(){
    return name;
}     
public void setName(String name){
    this.name = name;
}

// stockLevel method 
public int stockLevel(){
    return stockLevel;
}

public void setStockLevel(int stockLevel){
    this.stockLevel = stockLevel;
}

// statement to add stock to existing stock for an item


// if statement for alerting low stock


public Product(){}
}