package dmit2015.model;

public class Product {


    /*
    [x]Define private fields String name and double price.
    [x]Create a constructor with the signature public Product(String name, double price).
    [x]Reject a null, empty, or whitespace-only name by throwing IllegalArgumentException with the message Product name is required.
    [x]Reject a price less than or equal to zero by throwing IllegalArgumentException with the message Price must be greater than 0.
    [x]Store valid constructor arguments in the fields.
    [x]Provide getName() and getPrice() getters.
    [x]Implement public double getPriceWithTax() to return the price including 5% tax: price * 1.05.
     */


    private String name;
    private double price;


    public Product(String name, double price) {

        if (name == null || name.isBlank()) {

            throw new IllegalArgumentException("Title is required");
        }
        if(price<=0){
            throw new IllegalArgumentException("Price must be greater than 0");
        }


        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithTax(){return price * 1.05;}

}
