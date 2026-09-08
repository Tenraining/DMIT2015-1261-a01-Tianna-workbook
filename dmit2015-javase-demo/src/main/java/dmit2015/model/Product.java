package dmit2015.model;

public class Product {


    /*
    Define private fields String name and double price.
    Create a constructor with the signature public Product(String name, double price).
    Reject a null, empty, or whitespace-only name by throwing IllegalArgumentException with the message Product name is required.
    Reject a price less than or equal to zero by throwing IllegalArgumentException with the message Price must be greater than 0.
    Store valid constructor arguments in the fields.
    Provide getName() and getPrice() getters.
    Implement public double getPriceWithTax() to return the price including 5% tax: price * 1.05.
     */


    private String name;
    private double price;



    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
