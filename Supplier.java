public class Supplier {
    private int id;
    private String name;
    private String contact;
    // private String order_history;

    public Supplier(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        // Why do I need a constructor? What is this.?
        // Add order 
        // update_info()

     }
    
    public int getId() {
        return id;
        }
 
    public void setId(int id) {
        this.id = id;
    }
    
    // Getters and setters for name
    
    public String getName(){
        return name;
    }     
    public void setName(String name){
        this.name = name;
    }

        public Supplier(){}
}

// add method
// update method
// delete method