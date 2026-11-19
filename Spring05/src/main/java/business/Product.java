package business;

public class Product {
    String name;
    double price;

    public Product( String name,double price) {
        this.price = price;
        this.name = name;
    }

    public void displayProduct(){
        System.out.println("product name= "+name);
        System.out.println("product price= "+price);



    }
}
