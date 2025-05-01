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
    
//Product class output
        Product Toothbrush = new Product();
        Toothbrush.setName("Toothbrush");
        Toothbrush.getName();
        //according to Copolit, The line Toothbrush.getName(); is unnecessary because its return value is not used. It can be safely removed without affecting the program's behavior.
        System.out.println("The name of this product is " + Toothbrush.getName());
    }
}